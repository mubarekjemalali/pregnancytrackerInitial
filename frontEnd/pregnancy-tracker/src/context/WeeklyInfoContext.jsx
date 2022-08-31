import React from "react";
import { useContext, useState, useEffect } from "react";
import axios from "axios";

export const WeeklyInfoContext = React.createContext();

function WeeklyInfoProvider({ children }) {
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
      {children}
    </WeeklyInfoContext.Provider>
  );
}
export default WeeklyInfoProvider;
