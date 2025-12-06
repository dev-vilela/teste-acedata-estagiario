package com.acedata.estagio.dto;

import java.math.BigDecimal;

public class SalaryResponse {

    private BigDecimal salarioBruto;
    private BigDecimal salarioFamilia;
    private BigDecimal salarioLiq;

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(BigDecimal salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public BigDecimal getSalarioLiq() {
        return salarioLiq;
    }

    public void setSalarioLiq(BigDecimal salarioLiq) {
        this.salarioLiq = salarioLiq;
    }
}
