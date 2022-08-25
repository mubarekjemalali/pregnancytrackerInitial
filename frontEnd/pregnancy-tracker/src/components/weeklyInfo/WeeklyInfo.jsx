import React, { Component } from "react";
import BabyInfo from "../babyInfo/BabyInfo";
import Nutrition from "../nutritionInfo/Nutrition";
import WeekData from "../weekData/WeekData";
import Advice from "../weeklyAdvice/Advice";
import Exercise from "../weeklyExercise/Exercise";
import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";
import ListGroup from "react-bootstrap/ListGroup";
import { useState, createContext, useEffect } from "react";
import ReactDOM from "react-dom/client";
import axios from "axios";

export const WeeklyInfoContext = React.createContext();

function WeeklyInfo() {
  const [weeklyInfo, setWeeklyInfo] = useState(null);

  const fetchWeeklyInfo = async () => {
    let result = await axios.get("http://localhost:8080/weekly-info/19");
    setWeeklyInfo(result.data);
    console.log("printing data after await");
    console.log(result.data);
  };

  useEffect(() => {
    console.log("use effect called");
    fetchWeeklyInfo();
  }, []);

  return (
    <WeeklyInfoContext.Provider value={weeklyInfo}>
      <div>
        <Card style={{ width: "18rem" }}>
          <ListGroup variant="flush">
            <ListGroup.Item>
              <WeekData />
            </ListGroup.Item>
            <ListGroup.Item>
              <Advice />
            </ListGroup.Item>
            <ListGroup.Item>
              <BabyInfo />
            </ListGroup.Item>
            <ListGroup.Item>
              <Exercise />
            </ListGroup.Item>
            <ListGroup.Item>
              <Nutrition />
            </ListGroup.Item>
          </ListGroup>
        </Card>
      </div>
    </WeeklyInfoContext.Provider>
  );
}
export default WeeklyInfo;
