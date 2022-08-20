package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.dto.BabyInfoDto;
import com.iqratechnologies.pregnancytracker.model.BabyInfo;
import com.iqratechnologies.pregnancytracker.repo.BabyInfoRepo;
import com.iqratechnologies.pregnancytracker.service.BabyInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Service
@Transactional
public class BabyInfoServiceImpl implements BabyInfoService {
    BabyInfoRepo babyInfoRepo;
    ModelMapper modelMapper;

    // Baby related info
    // general info about the baby in that week
    // baby size comparison with common household items or fruits
    // baby physical info (size and weight)

    @Override
    public BabyInfoDto getBabyInfo(String weekNumber) {
        BabyInfo babyInfo = babyInfoRepo.findBabyInfoByWeekNumber(weekNumber);

       return modelMapper.map(babyInfo, BabyInfoDto.class);
    }

}
