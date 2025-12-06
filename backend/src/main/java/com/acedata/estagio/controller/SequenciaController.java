package com.acedata.estagio.controller;

import com.acedata.estagio.dto.SequenciaRequest;
import com.acedata.estagio.dto.SequenciaResponse;
import com.acedata.estagio.service.SequenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/sequencia")
public class SequenciaController {

    @Autowired
    private SequenciaService service;

    @PostMapping
    public SequenciaResponse processar(@RequestBody SequenciaRequest req){

        return  service.processar(req);
    }
}
