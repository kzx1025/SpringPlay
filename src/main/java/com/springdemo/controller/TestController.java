package com.springdemo.controller;

import com.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by iceke on 17/6/17.
 */
@Controller
@RequestMapping("/displayUser.html")
public class TestController {
    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public String displayUser(@RequestParam(required = false, defaultValue = "1") int id, Model model){
        model.addAttribute("user",userService.findById(id));
        return "home";

    }
}
