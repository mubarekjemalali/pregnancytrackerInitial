package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.dto.BabyInfoDto;
import com.iqratechnologies.pregnancytracker.dto.WeekDataDto;
import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoByConceiveDateDto;
import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoDto;
import com.iqratechnologies.pregnancytracker.model.BabyInfo;
import com.iqratechnologies.pregnancytracker.model.WeeklyInfo;
import com.iqratechnologies.pregnancytracker.repo.BabyInfoRepo;
import com.iqratechnologies.pregnancytracker.repo.WeeklyInfoRepo;
import com.iqratechnologies.pregnancytracker.service.BabyInfoService;
import com.iqratechnologies.pregnancytracker.service.WeekDataService;

import com.iqratechnologies.pregnancytracker.service.WeeklyInfoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.time.LocalDate;


@RequiredArgsConstructor
@Transactional
@Service
public class WeeklyInfoServiceImpl implements WeeklyInfoService {
    private final WeekDataService weekDataService;
    private final BabyInfoService babyInfoService;
    private final ModelMapper modelMapper;

    private final WeeklyInfoRepo weeklyInfoRepo;
    private final BabyInfoRepo babyInfoRepo;



    // get weekly info by passing conceived date
    @Override
    public WeeklyInfoDto getWeeklyInfoByDate(String conceivedDate) {

        //---------  get the weekNumber number from the data passed by the user or conceivedDate
        LocalDate conceivedD = LocalDate.parse(conceivedDate);
        LocalDate today = LocalDate.now();

        Duration duration = Duration.between(today, conceivedD);
        long diff = duration.toDays();
        String weekNumber = String.valueOf((int) diff / 7);

        // reminder days from the weekNumber, 1 weekNumber and 2 days
        int days = (int) diff % 7;

        WeekDataDto weekDataDto =  weekDataService.getWeekData(weekNumber, days);
//        BabyInfoDto babyInfoDto = babyInfoService.getBabyInfo(weekNumber);

        WeeklyInfo weeklyInfo = weeklyInfoRepo.findWeeklyInfoByWeekNumber(weekNumber);
        System.out.println("weekly info");
        System.out.println(weeklyInfo);
        WeeklyInfoDto weeklyInfoDto = modelMapper.map(weeklyInfo, WeeklyInfoDto.class);
        System.out.println("weekly info dto");
        System.out.println(weeklyInfoDto);
        weeklyInfoDto.setWeekDataDto(weekDataDto);
        System.out.println("weekly info dto after setter");
        System.out.println(weeklyInfoDto);

//        WeeklyInfoByConceiveDateDto weeklyInfoDto = new WeeklyInfoByConceiveDateDto(
//                String.valueOf(weekNumber), weekDataDto, babyInfoDto
//        );
//        WeeklyInfoDto weeklyInfoDto = new WeeklyInfoDto(
//                String.valueOf(weekNumber), babyInfoDto
//        );

        return weeklyInfoDto;
//        return null;


        // Advice of the weekNumber (will be in video format)
        // weekly tips



        // USE ALL THE INFO TO CREATE A WEEKLYINFODTO

    }

    @Override
    public WeeklyInfoDto getWeeklyInfo(String weekNumber) {

        return modelMapper.map(weeklyInfoRepo.findWeeklyInfoByWeekNumber(weekNumber), WeeklyInfoDto.class);

    }

    @Override
    public WeeklyInfoDto createWeeklyInfo(WeeklyInfoDto weeklyInfoDto) {

        WeeklyInfo weeklyInfo = weeklyInfoRepo.save(modelMapper.map(weeklyInfoDto, WeeklyInfo.class));
//        BabyInfoDto babyInfoDto = modelMapper.map(weeklyInfo.getBabyInfo(), BabyInfoDto.class);

        WeeklyInfoDto weeklyInfoDto1 = modelMapper.map(weeklyInfo, WeeklyInfoDto.class);
        // model mapper couldn't map babyInfo to babyInfoDto, so I did it manually
        // it is returning null, so I used setter to set babyInfoDto
//        weeklyInfoDto1.setBabyInfoDto(babyInfoDto);
        System.out.println("weeklyInfoDto");
        System.out.println(weeklyInfoDto1);
        return weeklyInfoDto1;
    }
}
