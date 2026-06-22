import React, { Component } from "react";

class ClassComp extends Component {
  render() {
    return (
      <div>
        <h1>Welcome {this.props.name}!</h1>
        <p>{this.props.message}</p>
      </div>
    );
  }
}

export default ClassComp;