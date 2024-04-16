import './App.css';
import Home from "./components/Home"
import Number from './components/Number';
import Hello from './components/Hello';
import { Link, Route, Routes } from 'react-router-dom';


function App() {
  return (
    <div className="App">

      <Link to="/home">Home</Link>
      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/:num" element={<Number />} />
        <Route path="/:string/:colortext/:colorbg" element={<Hello />} />
      </Routes>
    </div>
  );
}

export default App;
