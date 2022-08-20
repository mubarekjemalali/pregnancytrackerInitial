package com.iqratechnologies.pregnancytracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Slf4j
public class WeeklyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    String weekNumber;


    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_advice")
    WeeklyAdvice weeklyAdvice;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_babyInfo")
    BabyInfo babyInfo;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinColumn(name="id_momInfo")
    MomInfo momInfo;

//    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)

//    @JoinColumn(name="id_weekData")
//    WeekData weekData;

}
