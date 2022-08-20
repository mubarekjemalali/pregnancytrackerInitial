package com.iqratechnologies.pregnancytracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(nullable = false, unique = true)
    private String weekNumber;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_nutrition")
    NutritionInfo nutritionInfo;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_feelings")
    FeelingsInfo feelingsInfo;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_exercise")
    ExerciseInfo exerciseInfo;
}
