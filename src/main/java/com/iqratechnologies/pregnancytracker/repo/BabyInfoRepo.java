package com.iqratechnologies.pregnancytracker.repo;

import com.iqratechnologies.pregnancytracker.model.BabyInfo;
import com.iqratechnologies.pregnancytracker.model.WeekData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyInfoRepo extends CrudRepository<BabyInfo, Long> {
    public BabyInfo findByWeekNumber(int weekNumber );
    public BabyInfo findBabyInfoByWeekNumber(String weekNumber);

}
