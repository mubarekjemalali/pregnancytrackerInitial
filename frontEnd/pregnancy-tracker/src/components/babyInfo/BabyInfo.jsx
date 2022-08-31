import React from "react";
import { useContext } from "react";
import { WeeklyInfoContext } from "../../context/WeeklyInfoContext";
import styled from "styled-components";
import Container from "react-bootstrap/Container";

import "./babyInfo.css";

function BabyInfo() {
  const data = useContext(WeeklyInfoContext);

  return (
    <Container>
      <p className="weight">Weight: {data?.babyInfo.weight} kg</p>
      <p className="height">Height: {data?.babyInfo.height} m</p>
      {/* <p>General info: {data?.babyInfo.generalInfo}</p> */}
    </Container>
  );
}

// const Container = styled.div`
//   color: blue;
// `;
export default BabyInfo;
