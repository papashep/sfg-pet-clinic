package com.melvyn.sfgpetclinic.controllers;

import com.melvyn.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Melvyn on 16/Aug/2020
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController (OwnerService ownerService) {    // Modified to inject the OwnerService
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index", "index.html"})       // Moved "/owners" above to save entering it a number of
                                                            // of times, see VetController, watch out for '"",'
    public String listOwners(Model model) {

        model.addAttribute ("owners", ownerService.findAll ());   // All owners from the findAll() method of the
                                                                     // the ownerService.
        return "owners/index";
    }
}
