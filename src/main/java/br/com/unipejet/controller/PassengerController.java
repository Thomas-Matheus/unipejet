package br.com.unipejet.controller;

import br.com.unipejet.entity.Passenger;
import br.com.unipejet.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/panel/passenger")
@SessionAttributes("roles")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @RequestMapping(value = {"/", "/list" }, method = RequestMethod.GET)
    public String listProduct(ModelMap model) {
        List<Passenger> passengers = passengerService.findAllPassenger();
        model.addAttribute("passengers", passengers);
        model.addAttribute("loggedinuser", getPrincipal());
        return "passenger-list";
    }

    @RequestMapping(value = { "/show/{id}" }, method = RequestMethod.GET)
    public String editProduct(@PathVariable int id, ModelMap model) {
        Passenger passengers = passengerService.findById(id);
        model.addAttribute("passengers", passengers);
        model.addAttribute("loggedinuser", getPrincipal());
        return "passenger-new";
    }

    @RequestMapping(value = { "/delete/{id}" }, method = RequestMethod.GET)
    public String deleteProduct(@PathVariable int id) {
        passengerService.delete(id);
        return "redirect:/panel/passenger/list";
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
