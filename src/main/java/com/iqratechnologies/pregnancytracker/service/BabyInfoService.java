package com.iqratechnologies.pregnancytracker.service;

import com.iqratechnologies.pregnancytracker.dto.BabyInfoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public interface BabyInfoService {
    BabyInfoDto getBabyInfo(String weekNumber);
}
