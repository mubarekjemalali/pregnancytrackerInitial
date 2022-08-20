package com.iqratechnologies.pregnancytracker.dto;

import com.iqratechnologies.pregnancytracker.model.BabyInfo;
import com.iqratechnologies.pregnancytracker.model.MomInfo;
import com.iqratechnologies.pregnancytracker.model.WeeklyAdvice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyInfoDto {
    String weekNumber;

//    WeekDataDto weekDataDto;
//    BabyInfoDto babyInfoDto;
    BabyInfo babyInfo;
    MomInfo momInfo;
    WeeklyAdvice weeklyAdvice;
    WeekDataDto weekDataDto;


}
