import './App.css';
import FunctionalComponent from './funccomp';
import ClassComp from './classcomp';
import UseStateDemo, { Books } from './usestate';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <FunctionalComponent></FunctionalComponent>
        <ClassComp name="React" message="This is a class component with props!" />
        <UseStateDemo></UseStateDemo>
        <Books></Books>
      </header>
    </div>
  );
}
export default App;
