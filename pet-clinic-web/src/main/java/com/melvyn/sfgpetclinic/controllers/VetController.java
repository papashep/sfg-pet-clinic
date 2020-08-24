package com.melvyn.sfgpetclinic.controllers;

import com.melvyn.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Melvyn on 16/Aug/2020
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController (VetService vetService) {
        this.vetService = vetService;
    }



    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model) {

        model.addAttribute ("vets",vetService.findAll ());

        return "vets/index";
    }

}
