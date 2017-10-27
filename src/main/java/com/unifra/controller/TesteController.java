/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifra.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carlos Henrique
 */
@Controller
@EnableAutoConfiguration
public class TesteController {

    @RequestMapping("/teste")
    public ModelAndView teste() {
        ModelAndView model = new ModelAndView();
        model.setViewName("teste");

        return model;
    }
}
