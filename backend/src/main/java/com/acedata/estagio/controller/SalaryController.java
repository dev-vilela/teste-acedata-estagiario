package com.acedata.estagio.controller;

import com.acedata.estagio.dto.SalaryRequest;
import com.acedata.estagio.dto.SalaryResponse;
import com.acedata.estagio.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salario")
public class SalaryController {

    @Autowired
    private SalaryService service;

    @PostMapping
    public SalaryResponse calcular(@RequestBody SalaryRequest req){
        return service.calcular(req);
    }

}
