package com.iqratechnologies.pregnancytracker.model.weeklyInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class MomInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;



    @OneToOne
    @JoinColumn(name="id_nutrition")
    NutritionInfo nutritionInfo;

    @OneToOne
    @JoinColumn(name="id_feelings")
    FeelingsInfo feelingsInfo;

    @OneToOne
    @JoinColumn(name="id_exercise")
    ExerciseInfo exerciseInfo;
}
