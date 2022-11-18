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
    private UserRepository userrepo;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        // validate
        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getRole());
        System.out.println(user.getNickname());
        System.out.println(user.getTeam());



       User user_inserted = userrepo.save(user);
       model.addAttribute("message", "Welcome " + user_inserted.getNickname()+ "!");

        return "welcome";
    }

    @PostMapping("/gotoregister")
    public String goToRegister(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        // validate
        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getRole());
        System.out.println(user.getNickname());
        System.out.println(user.getTeam());



        User user_inserted = userrepo.save(user);
        model.addAttribute("message", user_inserted.getNickname() + "inserted.");

        return "registerPage";
    }
}
