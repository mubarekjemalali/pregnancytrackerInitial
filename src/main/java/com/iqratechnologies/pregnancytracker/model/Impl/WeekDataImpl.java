package com.iqratechnologies.pregnancytracker.model.Impl;
import com.iqratechnologies.pregnancytracker.model.interfaces.WeekData;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WeekDataImpl implements WeekData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
}
