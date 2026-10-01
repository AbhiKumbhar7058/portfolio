//package com.portfolio.abhishek.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @GetMapping("/")
//    public String home() {
//        return "index";
//    }
//}
package com.abhishek.portfolio.controller;

import com.abhishek.portfolio.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final Profile profile;

    public HomeController(Profile profile) {
        this.profile = profile;
    }

    @GetMapping("/abhi_portfolio")
    public String home(Model model) {
        model.addAttribute("p", profile);
        return "index";
    }
}