package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.model.NutritionInfo;
import com.iqratechnologies.pregnancytracker.service.NutritionInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@AllArgsConstructor
@Service
@Transactional
public class NutritionInfoServiceImpl implements NutritionInfoService {
    @Override
    public NutritionInfo nutritionInfo(String week) {
        return null;
    }
}
