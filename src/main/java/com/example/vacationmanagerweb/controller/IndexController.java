package com.example.vacationmanagerweb.controller;

import com.example.vacationmanagerweb.model.User;
import com.example.vacationmanagerweb.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class IndexController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {

       userRepo.save(user);
        return "index";
    }

    @PostMapping("/gotoregister")
    public String goToRegister(@ModelAttribute User user, Model model) {

        return "registerPage";
    }

    @GetMapping("/noAccountError")
    public String noAccountError(@ModelAttribute User user, Model model) {

        return "noAccountError";
    }

    @PostMapping("/returnToWelcome")
    public String returnToWelcome(@ModelAttribute User user, Model model) {

        return "welcome";
    }


    @GetMapping("/gotologin")
    public String goToLogin(@ModelAttribute User user, Model model) {

        return "login";
    }

    @GetMapping(value="/login")
    public String getUserByUsernameAndPassword(@ModelAttribute User user, Model model) {
        User loggedUser = userRepo.findByNicknameAndPasswd(user.getNickname(), user.getPasswd());
        model.addAttribute("getLoggedUser", loggedUser);

         if(loggedUser.getRole().contains("developer")) {
            return "developerPage";
        }
        return "welcome";
    }

}
