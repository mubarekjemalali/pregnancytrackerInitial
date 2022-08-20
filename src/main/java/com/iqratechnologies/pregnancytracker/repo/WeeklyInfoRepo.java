package com.iqratechnologies.pregnancytracker.repo;

import com.iqratechnologies.pregnancytracker.model.WeeklyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyInfoRepo extends CrudRepository<WeeklyInfo, Long> {

    WeeklyInfo findWeeklyInfoByWeekNumber(String weekNumber);
}
