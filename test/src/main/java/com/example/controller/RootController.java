/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Torn Sokly
 */
@Controller
public class RootController {
    
    @RequestMapping("/")
    public String home()
    {
        return "test";
    }
}
