package com.invoax.partfinder.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartfinderController {

    @RequestMapping("/")
    public String root() {
        return "index";
    }

}