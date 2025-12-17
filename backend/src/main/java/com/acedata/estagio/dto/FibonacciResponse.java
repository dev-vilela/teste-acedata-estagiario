package com.acedata.estagio.dto;

import java.util.List;

public class FibonacciResponse {

    private List<Integer> sequencia;
    private boolean pertence;

    public FibonacciResponse(List<Integer> sequencia, boolean pertence) {
        this.sequencia = sequencia;
        this.pertence = pertence;
    }

    public List<Integer> getSequencia() {
        return sequencia;
    }

    public void setSequencia(List<Integer> sequencia) {
        this.sequencia = sequencia;
    }

    public boolean isPertence() {
        return pertence;
    }

    public void setPertence(boolean pertence) {
        this.pertence = pertence;
    }
}