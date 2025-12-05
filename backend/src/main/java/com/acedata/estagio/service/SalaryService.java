package com.acedata.estagio.service;


import com.acedata.estagio.dto.SalaryRequest;
import com.acedata.estagio.dto.SalaryResponse;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public SalaryResponse calcular(SalaryRequest req){
        double salarioBruto = req.getValorHora() * req.getHorasTrabalhadas();

        double salarioFamilia;
        
        if (salarioBruto <= 788.00){
            salarioFamilia = req.getFilhosMenor() * 30.50;
        } else if (salarioBruto <= 1100.00) {
            salarioFamilia = req.getFilhosMenor() * 18.50;
        }else {
            salarioFamilia = req.getFilhosMenor() * 11.90;
        }

        double salarioLiq = salarioBruto + salarioFamilia;

        SalaryResponse resp = new SalaryResponse();

        resp.setSalarioBruto(salarioBruto);
        resp.setSalarioFamilia(salarioFamilia);
        resp.setSalarioLiq(salarioLiq);

        return resp;
    }

}
