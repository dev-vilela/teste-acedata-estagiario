package com.acedata.estagio.service;

import com.acedata.estagio.dto.SequenciaRequest;
import com.acedata.estagio.dto.SequenciaResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SequenciaService {

    public SequenciaResponse processar(SequenciaRequest req){

        List<Integer> lista = req.getNumeros();

        if (!req.getQuantidade().equals(lista.size())) {
            throw new IllegalArgumentException("Quantidade inválida");
        }


        Integer menor = lista.stream().min(Integer::compare).orElse(null);
        Integer maior = lista.stream().max(Integer::compare).orElse(null);

//        int menor = lista.get(0);
//        for(int m : list){
//            if(n < menor) menor = n;
//        }

        return new SequenciaResponse(lista,menor, maior);
    }

}
