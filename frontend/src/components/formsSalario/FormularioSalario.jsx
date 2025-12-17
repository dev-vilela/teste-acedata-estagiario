import { useState } from "react";
import api from "../../services/api";
import "./FormSalario.css";

function FormularioSalario() {
  const [valorHora, setValorHora] = useState("");
  const [horasTrabalhadas, setHorasTrabalhadas] = useState("");
  const [filhosMenor, setFilhosMenor] = useState("");
  const [resultado, setResultado] = useState(null);

  const calcularSalario = async (e) => {
    e.preventDefault();

    try {
      const response = await api.post("/salario", {
        valorHora: Number(valorHora),
        horasTrabalhadas: Number(horasTrabalhadas),
        filhosMenor: Number(filhosMenor),
      });

      setResultado(response.data);

    } catch (error) {
      alert("Erro ao conectar com a API");
      console.error(error);
    }
  };

  return (
    <div className="container">
      <h2>Cálculo de Salário Horista</h2>

      <form className="card" onSubmit={calcularSalario}>

        <label>Valor da Hora (R$):</label>
        <input
          type="number"
          min="0"
          value={valorHora}
          onChange={(e) => setValorHora(e.target.value)}
          required
        /><br /><br />

        <label>Horas Trabalhadas no Mês:</label>
        <input
          type="number"
          min="0"
          value={horasTrabalhadas}
          onChange={(e) => setHorasTrabalhadas(e.target.value)}
          required
        /><br /><br />

        <label>Filhos menores de 14 anos:</label>
        <input
          type="number"
          min="0"
          value={filhosMenor}
          onChange={(e) => setFilhosMenor(e.target.value)}
          required
        /><br /><br />

        <button type="submit" className="btn">Calcular</button>
      </form>

      {resultado && (
        <div className="resultado">
          <h3>Resultado</h3>
          <p><strong>Salário Bruto:</strong> R$ {resultado.salarioBruto.toFixed(2)}</p>
          <p><strong>Salário Família:</strong> R$ {resultado.salarioFamilia.toFixed(2)}</p>
          <p><strong>Salário Líquido:</strong> R$ {resultado.salarioLiq.toFixed(2)}</p>
        </div>
      )}
    </div>
  );
}

export default FormularioSalario;
