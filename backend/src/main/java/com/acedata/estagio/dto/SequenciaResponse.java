package com.acedata.estagio.dto;

import java.util.List;

public class SequenciaResponse {

    private List<Integer> numUsuario;
    private int  menor;
    private int maior;
    private int segMaior;

    public SequenciaResponse(List<Integer> numUsuario, int menor, int maior, int segMaior) {
        this.numUsuario = numUsuario;
        this.menor = menor;
        this.maior = maior;
        this.segMaior = segMaior;
    }

    public List<Integer> getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(List<Integer> numUsuario) {
        this.numUsuario = numUsuario;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getSegMaior() {
        return segMaior;
    }

    public void setSegMaior(int segMaior) {
        this.segMaior = segMaior;
    }
}
