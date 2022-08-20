package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.service.AdviceInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Service
@Transactional
public class AdviceInfoServiceImpl implements AdviceInfoService {
}
