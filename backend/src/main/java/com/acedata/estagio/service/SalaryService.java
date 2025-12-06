package com.acedata.estagio.service;


import com.acedata.estagio.dto.SalaryRequest;
import com.acedata.estagio.dto.SalaryResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SalaryService {

    public SalaryResponse calcular(SalaryRequest req){

        SalaryResponse resp = new SalaryResponse();
        BigDecimal salarioBruto = BigDecimal.valueOf(req.getValorHora()).multiply( BigDecimal.valueOf(req.getHorasTrabalhadas())) ;
        // double salarioBruto = req.getValorHora() * req.getHorasTrabalhadas();

        BigDecimal salarioFamilia;

        if (salarioBruto.compareTo(BigDecimal.valueOf(788.00)) <= 0){
             salarioFamilia = BigDecimal.valueOf(req.getFilhosMenor()).multiply(BigDecimal.valueOf(30.50));
        } else if (salarioBruto.compareTo(BigDecimal.valueOf(1100.00)) <= 0 ) {
            salarioFamilia = BigDecimal.valueOf(req.getFilhosMenor()).multiply(BigDecimal.valueOf(18.50));
        }else {
            salarioFamilia = BigDecimal.valueOf(req.getFilhosMenor()).multiply(BigDecimal.valueOf(11.90));
        }

        BigDecimal salarioLiq = salarioBruto.add(salarioFamilia);

        resp.setSalarioBruto(salarioBruto.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        resp.setSalarioFamilia(salarioFamilia.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        resp.setSalarioLiq(salarioLiq.setScale(2, BigDecimal.ROUND_HALF_EVEN));

        return resp;
    }

}
