import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./components/Home";
import SequenciaForm from "./components/sequencia/SequenciaForm";
import FibonacciForm from "./components/fibonacci/FibonacciForm";
import FormularioSalario from "./components/formsSalario/FormularioSalario";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />

        <Route path="/salario" element={<FormularioSalario />} />
        <Route path="/sequencia" element={<SequenciaForm />} />
        <Route path="/fibonacci" element={<FibonacciForm />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
