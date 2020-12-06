package com.krish.controller.impl;

import com.krish.controller.SBOAuthRESTV1Interface;
import com.krish.model.DefectsDTO;
import com.krish.service.DefectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
public class SBOAuthRESTController implements SBOAuthRESTV1Interface {
    @Autowired
    private DefectsService defectsService;

    @Override
    public DefectsDTO getDefectsInfo() {
        return defectsService.getDefectInfo();
    }

    @Override
    public DefectsDTO saveDefectsInfo(@Valid DefectsDTO defectsDTO) {
        return null;
    }
}
