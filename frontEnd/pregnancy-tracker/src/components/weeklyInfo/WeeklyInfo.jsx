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
import WeeklyInfoProvider from "../../context/WeeklyInfoContext";
// import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import styled from "styled-components";
import Carousel from "react-bootstrap/Carousel";
import week_7 from "../../assets/images/pregnancy-fruit-2021-week-7.png";
import trimester1 from "../../assets/images/1st trimester.jpeg";
import trimester2 from "../../assets/images/2nd trimester.jpeg";
import trimester3 from "../../assets/images/3rd trimester.jpeg";

import Image from "react-bootstrap/Image";
import "./weeklyInfo.css";

function WeeklyInfo() {
  return (
    <WeeklyInfoProvider>
      <div className="weeklyInfoContainer">
        <Carousel>
          <Carousel.Item>
            <div className="weekData">
              <p className="weekNumber">25 weeks, 6 days</p>
              <p className="weekSpan">Aug 26 - Sep 01</p>
            </div>
            <hr className="hr" />
            <div className="babyInfo">
              <div className="babyComparision">
                <img className="roundedCircle" src={week_7} alt="First slide" />
                <p>Your baby is as big as a blueberry.</p>
              </div>
              <div className="weeklyBabyInfo">
                <BabyInfo />
              </div>
            </div>
            <div className="momInfo">
              {/* <div className="weeklyInfo">
                <p>weekly advice</p>
              </div>
              <div className="weeklyExcercise">
                <p> excercise</p>
              </div>
              <div className="nutritionInfo">
                <p> excercise</p>
              </div> */}
              {/* <p>mom info</p> */}
            </div>
            {/* <Carousel.Caption>
              <h3>First slide label</h3>
              <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
            </Carousel.Caption> */}
          </Carousel.Item>
        </Carousel>
      </div>
      <h2>Your pregnancy week by week</h2>
      <div className="weeks">
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 1</p>
        </div>
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 2</p>
        </div>
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 3</p>
        </div>
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 4</p>
        </div>
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 5</p>
        </div>
        <div className="week">
          <img src={week_7} alt="" />
          <p>week 6</p>
        </div>
      </div>
      <h2>Trimesters</h2>
      {/* <p>
        Weather you're newly pregnant or trying to conceive, you may have
        questions about how your chiled will develop from a fertilized egg to a
        baby.{" "}
      </p> */}
      <div className="timesterContainer">
        <Card className="trimester">
          <Card.Img
            className="trimesterImage"
            src={trimester1}
            alt="Card image"
          />
          <Card.ImgOverlay>
            <Card.Title className="cardTitle">1st trimester</Card.Title>
            <Card.Text className="cardText">Weeks: 0 - 13</Card.Text>
            <Card.Text className="cardText">Months: 1 - 3</Card.Text>
          </Card.ImgOverlay>
        </Card>

        <Card className="  trimester">
          <Card.Img
            className="trimesterImage"
            src={trimester2}
            alt="Card image"
          />
          <Card.ImgOverlay>
            <Card.Title className="cardTitle">2st trimester</Card.Title>
            <Card.Text className="cardText">Weeks: 14 - 27</Card.Text>
            <Card.Text className="cardText">Months: 4 - 6</Card.Text>
          </Card.ImgOverlay>
        </Card>

        <Card className="  trimester">
          <Card.Img
            className="trimesterImage"
            src={trimester3}
            alt="Card image"
          />
          <Card.ImgOverlay>
            <Card.Title className="cardTitle">3st trimester</Card.Title>
            <Card.Text className="cardText">Weeks: 28 - 42</Card.Text>
            <Card.Text className="cardText">Months: 6 - 9</Card.Text>
          </Card.ImgOverlay>
        </Card>
      </div>

      <Container>
        <Row>
          <Col>
            <WeekData />
          </Col>
        </Row>
        <Row>
          <Col>
            <BabyInfo />
          </Col>
          <Col>
            <BabyInfo />
          </Col>
        </Row>
        <Row>
          <Col>
            <BabyInfo />
          </Col>
          <Col>
            <Exercise />
          </Col>
        </Row>
      </Container>
    </WeeklyInfoProvider>
  );
}

const Container = styled.div`
  color: red;
`;

export default WeeklyInfo;
