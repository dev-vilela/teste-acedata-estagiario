import { useState } from "react";
import api from "../../services/api";
import "./FibonacciForm.css";

export default function FibonacciForm() {
  const [n, setN] = useState("");
  const [resultado, setResultado] = useState(null);

  const enviar = async () => {
    try {
      const req = { n: Number(n) };
      const resp = await api.post("/fibonacci", req);
      setResultado(resp.data);
    } catch (error) {
      alert("Erro ao buscar sequência!");
    }
  };

  return (
    <div className="fib-container">
      <h2>Sequência de Fibonacci</h2>

      <div className="input-box">
        <label>Digite um valor N:</label>
        <input
          type="number"
          value={n}
          onChange={(e) => setN(e.target.value)}
        />
        <button onClick={enviar}>Calcular</button>
      </div>

      {resultado && (
        <div className="result-box">
          <h3>Resultado</h3>
          <p>
            <strong>Sequência:</strong> {resultado.sequencia.join(", ")}
          </p>
          <p>
            <strong>N pertence?</strong>{" "}
            {resultado.pertence ? "Sim" : "Não"}
          </p>
        </div>
      )}
    </div>
  );
}
