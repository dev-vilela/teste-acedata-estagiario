import { useState } from "react";
import api from "../../services/api";
import "./SequenciaForm.css" ;

export default function SequenciaForm() {
  const [quantidade, setQuantidade] = useState("");
  const [numeros, setNumeros] = useState([]);
  const [numeroAtual, setNumeroAtual] = useState("");
  const [resultado, setResultado] = useState(null);

  const handleAdicionarNumero = () => {
    if (numeroAtual === "") return;

    setNumeros([...numeros, Number(numeroAtual)]);
    setNumeroAtual("");
  };

  const handleEnviar = async () => {
    try {
      const req = {
        quantidade: Number(quantidade),
        numeros: numeros,
      };

      const resp = await api.post("/sequencia", req);

      setResultado(resp.data);
    } catch (err) {
      alert("Erro ao enviar sequência!");
    }
  };

  const bloqueado = numeros.length >= Number(quantidade);

  return (
    <div className="container-sequencia" >
      <h2>Exercício Sequência</h2>


      <div className="card">
      <div >
        <label>Quantidade de números: </label>
        <input
          type="number"
          value={quantidade}
          onChange={(e) => {
            setQuantidade(e.target.value);
            setNumeros([]);
            setResultado(null);
          }}
        />
      </div>


      {quantidade > 0 && !resultado && (
        <div >
          <p>
            Número {numeros.length + 1} de {quantidade}
          </p>

          <input
            type="number"
            value={numeroAtual}
            onChange={(e) => setNumeroAtual(e.target.value)}
            disabled={bloqueado}
          />

          {!bloqueado && (
            <button  onClick={handleAdicionarNumero}>Adicionar</button>
          )}

          {bloqueado && (
            <div >
              <button className="btn" onClick={handleEnviar}>Enviar Sequência</button>
            </div>
          )}

          <p className="digitados">
            Números digitados: {numeros.join(", ")}
          </p>
        </div>
      )} 

      {/* RESULTADO */}
      {resultado && (
        <div className="result-box">
          <h3>Resultado</h3>
          <p><strong>Números:</strong> {resultado.numUsuario.join(", ")}</p>
          <p><strong>Menor:</strong> {resultado.menor}</p>
          <p><strong>Maior:</strong> {resultado.maior}</p>
          <p><strong>Segundo Maior:</strong> {resultado.segMaior}</p>
        </div>
      )} </div>
    </div>
  );
}
