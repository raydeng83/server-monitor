package com.visiant.server.monitor.controller;

import com.visiant.server.monitor.domain.StatusEntity;
import com.visiant.server.monitor.service.SunGuardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SunGuard")
public class SunGuardController {

    @Autowired
    private SunGuardService sunGuardService;

    @RequestMapping("/am1")
    public StatusEntity getAmOneStatus(){
        return sunGuardService.getAmOneStatus();
    }
}
