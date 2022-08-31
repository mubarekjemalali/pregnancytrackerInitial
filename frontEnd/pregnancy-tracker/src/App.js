import logo from "./logo.svg";
import "./App.css";
import WeeklyInfo from "./components/weeklyInfo/WeeklyInfo";
import "bootstrap/dist/css/bootstrap.min.css";
import Button from "react-bootstrap/Button";
import { Link, Route, Routes } from "react-router-dom";
import Home from "./pages/home/Home";

function App() {
  return (
    <div className="App">
      {/* <Link >Home</Link> */}
      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
      {/* <WeeklyInfo /> */}
    </div>
  );
}

export default App;
