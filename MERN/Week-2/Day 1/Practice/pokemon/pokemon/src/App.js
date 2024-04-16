
import './App.css';
import React, { useState } from 'react';

function App() {
  const [pokemonNames, setPokemonNames] = useState([]);

  const FetchPok = () => {
    fetch("https://pokeapi.co/api/v2/pokemon")
      .then(response => response.json())
      .then((JsonResponse) => {
        console.log(JsonResponse)
        setPokemonNames(JsonResponse.results)
      })
      .catch(err => {
        console.log(err);
      })
  };

  return (
    <div className="App">
      <h1>Pokémon</h1>
      {/* {JSON.stringify(Heroes)} */}
      <button onClick={FetchPok}>Fetch SupperHeroes</button>
      {
        pokemonNames.map((p) => {
          return (
            <ul>
              <il>{p.name}</il>
            </ul>
          )
        })
      }
    </div>
  );
}

export default App;