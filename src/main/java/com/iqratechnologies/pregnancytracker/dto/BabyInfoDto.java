package com.iqratechnologies.pregnancytracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BabyInfoDto {
    private String weekNumber;
    private String weight;
    private String height;
    private String generalInfo;
}
