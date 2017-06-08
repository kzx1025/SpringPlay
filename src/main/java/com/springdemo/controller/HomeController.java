package com.springdemo.controller;

import com.springdemo.model.User;
import com.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by iceke on 17/6/8.
 */
@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping({"/", "/home"})
    public String homePage(@RequestParam(required = false, defaultValue = "1") int userId, Model model) {
        User user = userService.findById(userId);
        model.addAttribute("user",user);
        model.addAttribute("message","Hello!");
        return "home";
    }

}
