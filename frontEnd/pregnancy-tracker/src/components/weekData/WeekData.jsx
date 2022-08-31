import React from "react";
import "./weekData.css";
import { useContext } from "react";
import { WeeklyInfoContext } from "../../context/WeeklyInfoContext";

function WeekData() {
  const data = useContext(WeeklyInfoContext);
  console.log("data passed to weekly Data");
  console.log(data);

  return (
    <div>
      <p>week information</p>
      {/* {data || <p>loading</p>}
      {data && (
        <div>
          <p>{data.weekData.weekStartDate}</p>
          <p> to </p>
          <p>{data.weekData.weekEndDate}</p>
          <p>week</p>
        </div>
      )} */}
    </div>
  );
}

export default WeekData;
