package com.daniela.webapp.controller;

import com.daniela.webapp.model.User;
import com.daniela.webapp.service.UserService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //bean
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-account")
    public String createUser(User user, Model model) {
        try {
            userService.create(user);
        }catch(DataAccessException e) {
            model.addAttribute("errorWhenCreatingUser", true);
            return "create-account";
        }
        return "redirect:/homepage";
    }

    @GetMapping("/create-account")
    public String getUser(Model model) {
        model.addAttribute("user", new User());
        return "create-account";
    }

}
