import React from "react";
import NavBar from "../../components/navBar/NavBar";
import TopNav from "../../components/topNavBar/TopNav";
import WeeklyInfo from "../../components/weeklyInfo/WeeklyInfo";
import Footer from "../../components/footer/Footer";

function Home() {
  return (
    <div>
      <TopNav />
      <NavBar />
      <WeeklyInfo />
      <Footer />
    </div>
  );
}

export default Home;
