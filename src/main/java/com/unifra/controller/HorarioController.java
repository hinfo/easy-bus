/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unifra.controller;

import com.unifra.beans.Horario;
import com.unifra.beans.Linha;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos Henrique
 */
@RestController
@RequestMapping("/horario")
public class HorarioController {

    @GetMapping(value = "/get", produces = {MediaType.APPLICATION_JSON})
    @ResponseBody
    public List<Linha> getHorariosByEmpresa(@RequestParam("id") String empresaId) {
        List<Linha> horarios = new ArrayList<>();
        Linha linha = new Linha();
        linha.setHora("10:20");
        linha.setSentido("Centro-Bairro");
        horarios.add(linha);

        return horarios;
    }

    @PostMapping(value = "/add")
    public String postHorarios(@RequestParam(value = "empresa") String nomeEmpresa) {
        return "Empresa " + nomeEmpresa;
    }
}
