package org.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.transport.entities.Bus;
import org.transport.services.BusService;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class WebController {
    @Autowired
    BusService busService;

    /*@RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }*/

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/workerMenu", method = RequestMethod.GET)
    public String workerMenu() {
        return "workerMenu";
    }

    @RequestMapping(value = "/clientMenu", method = RequestMethod.GET)
    public String clientMenu() {
        return "clientMenu";
    }

    /*@RequestMapping(value = "/addBus", method = RequestMethod.GET)
    public String showAddBusForm(Model model) {
        Bus bus = new Bus();
        model.addAttribute("busForm", bus);

        populateDefaultModel(model);
        return "addBus";
    }*/

    @RequestMapping(value = { "/addBus" }, method = RequestMethod.POST)
    public String addBus( Bus bus,ModelMap model) {
        busService.addBus(bus);

        model.addAttribute("success", "Автобус " + bus.getBusID() + " вместимостью: "+ bus.getCapacity() + " записан!");
        //return "success";
        return "registrationsuccess";
    }

    @RequestMapping(value = "/showBuses", method = RequestMethod.GET)
    public String showBuses(ModelMap model) {
        model.addAttribute("busListAttribute", busService.findAllBuses());
        return "busList";
    }


    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {

        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {

        return "final";
    }


}
