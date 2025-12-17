package com.acedata.estagio.service;

import com.acedata.estagio.dto.FibonacciResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    public FibonacciResponse calcular(int n) {
    //METODO PROPOSTO NA ENTREVISTA
        List<Integer> lista = new ArrayList<>();

        if (n <= 0) {
            return new FibonacciResponse(lista, false);
        }

        
        lista.add(1);
        if (n == 1) return new FibonacciResponse(lista, false);

        lista.add(1);
        if (n == 2) return new FibonacciResponse(lista, false);

        for (int i = 2; i < n; i++) {
            int atual = lista.get(i - 1);
            int anterior = lista.get(i - 2);

            int proximo;

            if (atual % 2 == 0 && i >= 2) {

                proximo = atual + anterior + lista.get(i - 3);
            } else {

                proximo = atual + anterior;
            }

            lista.add(proximo);
        }

        boolean pertence = lista.contains(n);

        return new FibonacciResponse(lista, pertence);
    }
}

//SEQUENCIA DE FIBONACCI

/*
*   public FibonacciResponse calcular(int n){
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

* */
