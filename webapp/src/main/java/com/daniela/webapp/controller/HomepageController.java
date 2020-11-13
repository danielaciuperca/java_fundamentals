package com.daniela.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/homepage")
    public String getHomepage() {
        return "homepage";
    }
}
