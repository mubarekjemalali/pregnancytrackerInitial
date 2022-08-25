import logo from "./logo.svg";
import "./App.css";
import WeeklyInfo from "./components/weeklyInfo/WeeklyInfo";
import "bootstrap/dist/css/bootstrap.min.css";
import Button from "react-bootstrap/Button";
import ReactDOM from "react-dom/client";

function App() {
  return (
    <div className="App">
      <WeeklyInfo />
    </div>
  );
}

export default App;
