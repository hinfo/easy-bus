/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifra.controller;

import javax.ws.rs.Produces;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carlos Henrique
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    @Produces("text/plain") // define qual tipo MIME é retornado para o cliente
    public String exibir() {
        return "servidor online";
    }

}
