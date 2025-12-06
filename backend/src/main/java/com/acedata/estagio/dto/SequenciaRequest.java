package com.acedata.estagio.dto;

import java.util.List;

public class SequenciaRequest {

    private List<Integer> numeros;
    private Integer quantidade;

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
