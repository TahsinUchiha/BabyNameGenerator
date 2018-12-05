import React, { Component } from "react";
import axios from "axios";
import ReactDOM from 'react-dom';
import { BootstrapTable, 
  TableHeaderColumn, 
 } from 'react-bootstrap-table';
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
                message: "",
                valid: ""

        }
    }
    addBabyName = e => {
      e.preventDefault();
      const babyId = e.target.elements.babyId.value;
     
        axios
          .post(`http://localhost:8080/Baby/addBaby`, {
        babyId  
        })
          .then(res => {
        //  const babyName = res.data.babyName;
        //  this.setState({ babyName });
        
            alert("Good luck!")
          });
    };
    componentDidMount() {
      this.getAllBabies();
    }
    getAllBabies = () => {
      axios.get(`http://localhost:8080/Baby/getAllBabies`).then(res => {
        console.log(res)
        this.setState({
          babies: res.data
          
        });
      });
    }

    componentWillMount() {
      axios.all([
        axios.get(`http://localhost:8080/Baby/getAllBabies`),
      ])
      .then(axios.spread(function ( babyId, babyName ) {
        let baby = babyId.data.concat(babyName.data);
          this.setState({ baby })
      }))
  
      .catch(error => console.log(error));
   
   }


     render() {
      return (
        <div>
              <header>
          <h1>Get a Baby Name</h1>
        </header>
        <Form horizontal onSubmit={this.addBabyName}>
          <FormGroup>
            <Col componentClass={ControlLabel} sm={4}>
              <p align="right"> </p>
            </Col>
            <Col sm={5}>
              <FormControl
                type="text"
                name="babyId"
                placeholder="Enter anything to start"
              />
            </Col>
          </FormGroup>
          <FormGroup>
            <Col smOffset={3} sm={5}>
              <Button bsStyle="info" type="submit">
                Add Baby
              </Button>
            </Col>
          </FormGroup>
          </Form>
      <h1> List of all Babies </h1>
      <BootstrapTable data={this.state.babies} 
     class="table"
     striped
      search>
      <TableHeaderColumn dataField='babyId' isKey>ID</TableHeaderColumn>
      <TableHeaderColumn dataField='babyName'>Name</TableHeaderColumn>
     
      </BootstrapTable>
        </div>
      );
     }
}

export default CreateBabyName;