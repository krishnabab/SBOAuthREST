package com.krish.controller;

import com.krish.model.DefectsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
@Api(tags = "v1.0")
@RequestMapping("v1")
public interface SBOAuthRESTV1Interface {
    @ApiOperation(value = "Gives defects info")
    @GetMapping(value = "/defects/info")
    DefectsDTO getDefectsInfo();

    @ApiOperation(value = "Gives defects info")
    @PostMapping(value = "/defects/info")
    DefectsDTO saveDefectsInfo(@Valid @RequestBody DefectsDTO defectsDTO);
}
