package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.dto.WeekDataDto;
import com.iqratechnologies.pregnancytracker.service.WeekDataService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Service
@AllArgsConstructor
@Transactional
public class WeekDataServiceImpl implements WeekDataService {
//    private final WeekDataRepo weekDataRepo;

    @Override
    public String getWeekStartDate(int days) {

        // days-1 because we don't consider today's data
        LocalDate weekStartDate = LocalDate.now().minusDays(days - 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return formatter.format(weekStartDate);


    }

    @Override
    public String getWeekEndDate(int days) {
        LocalDate weekEndDate = LocalDate.now().plusDays(7-days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return formatter.format(weekEndDate);
    }

    @Override
    public WeekDataDto getWeekData(String weekNumber, int days) {

        String weekStartDate = getWeekStartDate(days);
        String weekEndDate = getWeekEndDate(days);
        String numberOfDays = String.valueOf(days);

        WeekDataDto weekDataDto = new WeekDataDto(
                weekStartDate,
                weekEndDate,
                weekNumber,
                numberOfDays
        );
        return weekDataDto;
    }


}
