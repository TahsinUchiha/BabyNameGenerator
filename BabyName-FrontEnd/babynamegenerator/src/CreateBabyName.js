import React, { Component } from "react";
import axios from "axios";
import ReactDOM from 'react-dom';
import {
  FormControl,
  Form,
  Col,
  FormGroup,
  ControlLabel,
  Button
} from "react-bootstrap";

class CreateBabyName extends Component {
    constructor(props){
        super(props);

        this.state = {
            babyId: "",
            babyName: "",
            validation: {
                message: "",
                valid: ""
            }

        }
    }
    addBabyName = e => {
      e.preventDefault();
  
     {
        axios
          .post( `http://localhost:8080/Baby/addBaby`, {
          })
          .then(res => {
         const babyName = res.data.babyName;
         this.setState({ babyName });
            });
            alert("Good luck!")
      } 
    };

     render() {
      return (
        <div>
              <header>
          <h1>Get a Baby Name</h1>
        </header>
       <form onSubmit={this.addBabyName}>
        <button name= "button">
          Get Name
        </button>
        {this.state.babyName ? <p> babyName : {this.state.babyName}</p>  :<p> Please Click! </p>}
            </form>
        </div>
      );
     }
}

export default CreateBabyName;