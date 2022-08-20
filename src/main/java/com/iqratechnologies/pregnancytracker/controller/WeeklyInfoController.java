package com.iqratechnologies.pregnancytracker.controller;

import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoByConceiveDateDto;
import com.iqratechnologies.pregnancytracker.dto.WeeklyInfoDto;
import com.iqratechnologies.pregnancytracker.service.WeeklyInfoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.iqratechnologies.pregnancytracker.service.impl.WeeklyInfoServiceImpl;

@RestController
// @Data
@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/weekly-info")
public class WeeklyInfoController {

    private final WeeklyInfoService weeklyInfoService;



    // get the conceived date form the loggedIn user data
    //read more on how to get the information of the user
    // resources https://www.baeldung.com/get-user-in-spring-security
    @GetMapping("/")
    public ResponseEntity<WeeklyInfoDto> getWeeklyInfoBy(String conceivedDate) {
        return ResponseEntity.ok(
                weeklyInfoService.getWeeklyInfoByDate(conceivedDate)

        );
    }

    // get by weekNumber
    @GetMapping("/{weekNumber}")
    public ResponseEntity<WeeklyInfoDto> getWeeklyInfo(@PathVariable String weekNumber) {
        System.out.println("week number path variable" + weekNumber);
        return ResponseEntity.ok(
                weeklyInfoService.getWeeklyInfo(weekNumber)
        );
    }
    //@Valid to check if the request body is valid
    @PostMapping
    public ResponseEntity<WeeklyInfoDto> createWeeklyInfo(@RequestBody WeeklyInfoDto weeklyInfoDto ) {
        return ResponseEntity.ok(
                weeklyInfoService.createWeeklyInfo(weeklyInfoDto)
        );
    }
}
