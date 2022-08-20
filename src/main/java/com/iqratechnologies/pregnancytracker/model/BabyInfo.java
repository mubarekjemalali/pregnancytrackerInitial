package com.iqratechnologies.pregnancytracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BabyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

    @Column(nullable = false, unique = true)
    private String weekNumber;
    private String weight;
    private String height;
    private String generalInfo;

}
