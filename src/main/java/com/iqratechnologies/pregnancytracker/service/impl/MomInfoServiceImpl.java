package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.service.ExerciseInfoService;
import com.iqratechnologies.pregnancytracker.service.FeelingsInfoService;
import com.iqratechnologies.pregnancytracker.service.MomInfoService;
import com.iqratechnologies.pregnancytracker.service.NutritionInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Service
@Transactional
public class MomInfoServiceImpl implements MomInfoService {
    //mom related info
    // general info(body changes, feelings...)
    // exercise of the week
    // nutrition/ recipe suggestion for the week (will include recipe and video)

        FeelingsInfoService feelingsInfoService;
        ExerciseInfoService exerciseInfoService;
        NutritionInfoService nutritionInfoService;

//        public MomInfoDto getMomInfo(String week) {
//            feelingsInfoService.getFeelings(week);
//            exerciseInfoService.getExercise(week);
//            nutritionInfoService.getNutrition(week);
//        }
}
