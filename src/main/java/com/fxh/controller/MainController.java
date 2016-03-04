package com.fxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 58 on 2016-2-29.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name","fxh");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}