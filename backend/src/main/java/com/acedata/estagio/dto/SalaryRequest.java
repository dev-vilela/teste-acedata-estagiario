package com.acedata.estagio.dto;

public class SalaryRequest {

    //@Min(value = 0, message = "Valor da hora deve ser maior ou igual a zero")
    private double valorHora;
    private int horasTrabalhadas;
    private int filhosMenor;


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getFilhosMenor() {
        return filhosMenor;
    }

    public void setFilhosMenor(int filhosMenor) {
        this.filhosMenor = filhosMenor;
    }
}
