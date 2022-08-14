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
public class WeeklyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;





    @OneToOne
    @JoinColumn(name="id_advice")
    Advice advice;
    
    @OneToOne
    @JoinColumn(name="id_babyInfo")
    BabyInfo babyInfo;

    @OneToOne
    @JoinColumn(name="id_momInfo")
    MomInfo momInfo;

    @OneToOne
    @JoinColumn(name="id_weekData")
    WeekData weekData;

}
