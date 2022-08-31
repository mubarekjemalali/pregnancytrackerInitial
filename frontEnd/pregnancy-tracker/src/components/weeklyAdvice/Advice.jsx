import React from "react";
import { useContext } from "react";
import { WeeklyInfoContext } from "../../context/WeeklyInfoContext";

function Advice() {
  const data = useContext(WeeklyInfoContext);

  return <p>{data?.weeklyAdvice.message}</p>;
}

export default Advice;
