package com.acedata.estagio.dto;

public class SalaryResponse {

    private double salarioBruto;
    private double salarioFamilia;
    private double salarioLiq;


    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public double getSalarioLiq() {
        return salarioLiq;
    }

    public void setSalarioLiq(double salarioLiq) {
        this.salarioLiq = salarioLiq;
    }
}
