package com.krish.service;

import com.krish.model.DefectsDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DefectsService {
    public DefectsDTO getDefectInfo() {
        return DefectsDTO.builder()
                .defects(Arrays.asList("defect1","defect2")).build();
    }
}
