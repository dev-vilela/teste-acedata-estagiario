package com.acedata.estagio.service;

import com.acedata.estagio.dto.FibonacciResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    public FibonacciResponse calcular(int n){
        List<Integer> lista = new ArrayList<>();

        int a = 1, b = 1;

        if(n >= 1)lista.add(1);
        if(n >= 2)lista.add(1);

        for (int i = 3; i <= n; i++){
            int c = a + b;
            lista.add(c);

            a = b;
            b = c;
        }

        boolean pertence = lista.contains(n);

        return new FibonacciResponse(lista, pertence);
    }

}
