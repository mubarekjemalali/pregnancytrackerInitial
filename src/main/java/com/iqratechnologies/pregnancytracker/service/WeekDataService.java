package com.iqratechnologies.pregnancytracker.service;

import com.iqratechnologies.pregnancytracker.dto.WeekDataDto;

import java.time.LocalDate;

public interface WeekDataService {

    String getWeekStartDate(int days);
    String getWeekEndDate(int days);

    WeekDataDto getWeekData(String weeks, int days);
}
