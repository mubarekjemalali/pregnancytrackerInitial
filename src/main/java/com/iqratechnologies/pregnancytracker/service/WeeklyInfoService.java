package com.iqratechnologies.pregnancytracker.service;

import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoByConceiveDateDto;
import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface WeeklyInfoService {

    WeeklyInfoDto getWeeklyInfoByDate(String conceivedDate);
    WeeklyInfoDto getWeeklyInfo(String weekNumber);


    WeeklyInfoDto createWeeklyInfo(WeeklyInfoDto weeklyInfoDto);
}
