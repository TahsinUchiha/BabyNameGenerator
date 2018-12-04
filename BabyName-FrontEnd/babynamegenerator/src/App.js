import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import CreateBabyName from './CreateBabyName.js'

class App extends Component {
  render() {
    return (
      <div className="App">
        <CreateBabyName/>
      </div>
    );
  }
}

export default App;
