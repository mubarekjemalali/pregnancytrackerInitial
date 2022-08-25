import React from "react";
import { useContext } from "react";
import WeeklyInfoContext from "../weeklyInfo/WeeklyInfo";

function BabyInfo() {
  const weeklyInfo = useContext(WeeklyInfoContext);

  return (
    // <div>
    //   {weeklyInfo && (
    //     <div>
    //       <p>Weight: {weeklyInfo.weight}</p>
    //       <p>Height: {weeklyInfo.height}</p>
    //       <p>General info: {weeklyInfo.generalInfo}</p>
    //     </div>
    //   )}
    // </div>
    <div>
      <p>bay info</p>
    </div>
  );
}

export default BabyInfo;
