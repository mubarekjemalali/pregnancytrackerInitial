package com.iqratechnologies.pregnancytracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyInfoByConceiveDateDto {

    String weekNumber;
    WeekDataDto weekDataDto;
    BabyInfoDto babyInfoDto;



}
