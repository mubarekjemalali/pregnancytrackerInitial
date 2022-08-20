package com.iqratechnologies.pregnancytracker.repo;

import com.iqratechnologies.pregnancytracker.model.WeekData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// what is Id(in this case Integer inside the CrudRepository??
@Repository
public interface WeekDataRepo extends CrudRepository<WeekData, Long> {
    public WeekData findByWeekNumber(int weekNumber);
}
