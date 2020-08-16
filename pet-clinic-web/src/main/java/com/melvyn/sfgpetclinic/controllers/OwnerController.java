package com.melvyn.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Melvyn on 16/Aug/2020
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index", "index.html"})       // Moved "/owners" above to save entering it a number of
                                                            // of times, see VetController, watch out for '"",'
    public String listOwners() {

        return "owners/index";
    }
}
