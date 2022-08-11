package com.iqratechnologies.pregnancytracker.model.Impl;

import com.iqratechnologies.pregnancytracker.model.interfaces.BabyInfo;
import com.iqratechnologies.pregnancytracker.model.interfaces.MomInfo;
import com.iqratechnologies.pregnancytracker.model.interfaces.WeekData;
import com.iqratechnologies.pregnancytracker.model.interfaces.WeeklyInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WeeklyInfoImpl implements WeeklyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;

    //public WeekData weekData;
//    public MomInfo momInfo;
//    public BabyInfo babyInfo;
}
