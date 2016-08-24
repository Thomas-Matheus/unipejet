package br.com.unipejet.controller;

import br.com.unipejet.entity.Passenger;
import br.com.unipejet.entity.Seats;
import br.com.unipejet.entity.Travel;
import br.com.unipejet.service.PassengerService;
import br.com.unipejet.service.SeatsService;
import br.com.unipejet.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class JetController {

    @Autowired
    TravelService travelService;

    @Autowired
    SeatsService seatsService;

    PassengerService passengerService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        List<Travel> travels = travelService.findAllTravel();
        model.addAttribute("travel", travels);
        return "jet";
    }

    @RequestMapping(value = {"/travel/{id}"}, method = RequestMethod.GET)
    public String showTravels(@PathVariable int id, ModelMap model) {

        List<Seats> seats = seatsService.findAllSeats();
        List<Passenger> passengers = passengerService.findAllPassenger();

        for(Passenger passenger: passengers){
            for (Seats seat : seats) {
                if (seat.getId().equals(passenger.getSeatsId().getId())) {
                    seat.setBusy(true);
                }
            }
        }

        model.addAttribute("seats", seats);
        model.addAttribute("travelId", id);


        return "travel";
    }

    @RequestMapping(value = {"/travel/buy/{seatsId}/travel/${travelId}"}, method = RequestMethod.GET)
    public String showPassenger(@PathVariable int seatsId, @PathVariable int travelId, ModelMap model) {
        Passenger passenger = new Passenger();
        model.addAttribute("seatsId", seatsId);
        model.addAttribute("travelId", travelId);
        model.addAttribute("passenger", passenger);

        return "buy";
    }

    @RequestMapping(value = {"/travel/buy/"}, method = RequestMethod.POST)
    public String showPassenger(@Valid Passenger passenger, BindingResult result, ModelMap model, @PathVariable int id) {

        if (result.hasErrors()) {
            return "redirect:/index";
        }

        passengerService.save(passenger);

        model.addAttribute("success", "Assento " + passenger.getName() + " comprado com sucesso");
        return "redirect:/index";
    }
}
