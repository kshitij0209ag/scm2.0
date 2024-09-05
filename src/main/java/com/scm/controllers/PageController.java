package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("hello", "substring");
        model.addAttribute("Practice", "Project");
        model.addAttribute("GithubRepository", "https://github.com/kshitij0209ag/");
        return "home";
    }

    // about route 
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About Page Loading  ");
        return "about";
    }

    // Services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Service Page Loading  ");
        return "services";
    }
    

}
