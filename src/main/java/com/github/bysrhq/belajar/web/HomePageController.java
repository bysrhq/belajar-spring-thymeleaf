/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bysrhq
 */
@Controller
public class HomePageController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        
        return "homePage";
    }
}
