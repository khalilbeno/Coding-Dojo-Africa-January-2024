import { Route, Routes } from 'react-router-dom';
import './App.css';
import Create from './components/Create';
import List from './components/List';
import Detail from './components/Detail';
import Edit from './components/Edit';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/create' element={< Create />} />
        <Route path='/' element={< List />} />
        <Route path='/product/:id' element={< Detail />} />
        <Route path='/product/edit/:id' element={< Edit />} />
      </Routes>
    </div>
  );
}

export default App;
