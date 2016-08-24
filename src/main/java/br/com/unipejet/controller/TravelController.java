package br.com.unipejet.controller;

import br.com.unipejet.entity.Travel;
import br.com.unipejet.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/panel/travel")
@SessionAttributes("roles")
public class TravelController {

    @Autowired
    TravelService travelService;

    @RequestMapping(value = {"/", "/list" }, method = RequestMethod.GET)
    public String listProduct(ModelMap model) {
        List<Travel> travels = travelService.findAllTravel();

        model.addAttribute("travels", travels);
        model.addAttribute("loggedinuser", getPrincipal());
        return "travel-list";
    }

    @RequestMapping(value = { "/new/{id}" }, method = RequestMethod.GET)
    public String newProduct(@PathVariable int id, ModelMap model) {
        Travel travel = new Travel();
        model.addAttribute("seats", id);
        model.addAttribute("travel", travel);
        model.addAttribute("loggedinuser", getPrincipal());
        return "travel-new";
    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveProduct(@Valid Travel travel, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "travel-new";
        }

        travelService.save(travel);

        model.addAttribute("success", "Viagem " + travel.getLeaving() + " cadastrado com sucesso");
        model.addAttribute("loggedinuser", getPrincipal());

        return "redirect:/panel/travel/list";
    }

    @RequestMapping(value = { "/delete/{id}" }, method = RequestMethod.GET)
    public String deleteProduct(@PathVariable int id) {
        travelService.delete(id);
        return "redirect:/panel/travel/list";
    }

    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}
