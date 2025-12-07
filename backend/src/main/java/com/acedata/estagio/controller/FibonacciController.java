package com.acedata.estagio.controller;

import com.acedata.estagio.dto.FibonacciRequest;
import com.acedata.estagio.dto.FibonacciResponse;
import com.acedata.estagio.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/fibonacci")
public class FibonacciController {

    @Autowired
    private FibonacciService service;

    @PostMapping
    public FibonacciResponse calcular(@RequestBody FibonacciRequest req){
        return  service.calcular(req.getN());
    }

}
