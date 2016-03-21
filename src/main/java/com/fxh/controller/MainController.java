package com.fxh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by 58 on 2016-2-29.
 */
@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);


    @Value("${testname}")
    private String haha;

    @Value("${qqq}")
    private String num;

    @RequestMapping(value="/matrix/{ownerId}/pets/{petId}")
    public void index(@MatrixVariable Map<String, String> matrixVars,
                        @MatrixVariable(pathVar="petId") Map<String, String> petMatrixVars){
        logger.info("success matrix");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Model model) {
        int a = 1;
        int b = a+1;
        model.addAttribute("name","fxh");
        model.addAttribute("te",haha);
        model.addAttribute("num",num);


        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}