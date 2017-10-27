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
        Linha linha1 = new Linha();
        linha1.setHora("10:20");
        linha1.setSentido("Centro-Bairro");
        horarios.add(linha1);
        Linha linha2 = new Linha();
        linha2.setHora("10:30");
        linha2.setSentido("Centro-Bairro");
        horarios.add(linha2);
        Linha linha3 = new Linha();
        linha3.setHora("10:40");
        linha3.setSentido("Centro-Bairro");
        horarios.add(linha3);
        Linha linha4 = new Linha();
        linha4.setHora("10:50");
        linha4.setSentido("Centro-Bairro");
        horarios.add(linha4);
        Linha linha5 = new Linha();
        linha5.setHora("11:00");
        linha5.setSentido("Centro-Bairro");
        horarios.add(linha5);
        Linha linha6 = new Linha();
        linha6.setHora("11:10");
        linha6.setSentido("Centro-Bairro");
        horarios.add(linha6);
        Linha linha7 = new Linha();
        linha7.setHora("11:20");
        linha7.setSentido("Centro-Bairro");
        horarios.add(linha7);

        return horarios;
    }

    @PostMapping(value = "/add")
    public String postHorarios(@RequestParam(value = "empresa") String nomeEmpresa) {
        return "Empresa " + nomeEmpresa;
    }
}
