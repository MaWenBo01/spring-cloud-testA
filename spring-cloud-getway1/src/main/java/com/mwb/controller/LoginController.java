package com.mwb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/2/11.
 */
@RestController
public class LoginController {
    @RequestMapping(value="/login")
    public String login(){
        return "hellow,bearPotMan";
    }
}
