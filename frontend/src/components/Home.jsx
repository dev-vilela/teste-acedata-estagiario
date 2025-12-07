import { Link } from "react-router-dom";
import "./Home.css";

export default function Home() {
  return (
    <div className="home-container">
      <h1>Exercícios</h1>

      <div className="cards-container">
        
        <div className="card">
          <img src="/img/salario.png" alt="Salário" />
          <h3>Cálculo de Salário</h3>
          <Link to="/salario" className="btn">Acessar</Link>
        </div>

        <div className="card">
          <img src="/img/sequencia.png" alt="Sequência" />
          <h3>Sequência de Números</h3>
          <Link to="/sequencia" className="btn">Acessar</Link>
        </div>

        <div className="card">
          <img src="/img/image.png" alt="Fibonacci" />
          <h3>Fibonacci</h3>
          <Link to="/fibonacci" className="btn">Acessar</Link>
        </div>

      </div>
    </div>
  );
}
