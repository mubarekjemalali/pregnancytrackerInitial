package com.iqratechnologies.pregnancytracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeekDataDto {
    private String weekStartDate;
    private String weekEndDate;
    private String weekNumber;
    private String days;
}
