import React from "react";
import { useContext } from "react";
import { WeeklyInfoContext } from "../../context/WeeklyInfoContext";

function Exercise() {
  const data = useContext(WeeklyInfoContext);
  return (
    <div>
      <p>exercise</p>
      <p>{data?.momInfo.exerciseInfo.briefInfo}</p>
      <p>{data?.momInfo.exerciseInfo.detailInfo}</p>
    </div>
  );
}

export default Exercise;
