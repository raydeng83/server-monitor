package com.visiant.server.monitor.controller;

import com.visiant.server.monitor.domain.StatusEntity;
import com.visiant.server.monitor.service.SunGuardService;
import com.visiant.server.monitor.service.TestCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/SunGuard")
public class SunGuardController {

    @Autowired
    private SunGuardService sunGuardService;

    @Autowired
    private TestCService testCService;

    @RequestMapping("/am1")
    public StatusEntity getAmOneStatus(){
        return sunGuardService.getAmOneStatus();
    }

    @RequestMapping("/am2")
    public StatusEntity getAmTwoStatus(){
        return sunGuardService.getAmTwoStatus();
    }

    @RequestMapping("/amLoadBalancer")
    public StatusEntity getAmLoadBalancerStatus(){
        return sunGuardService.getLoadBalancerStatus();
    }

    @RequestMapping("/idm1")
    public StatusEntity getIdmOneStatus(){
        return testCService.getIdmOneStatus();
    }

    @RequestMapping("/idm2")
    public StatusEntity getIdmTwoStatus(){
        return testCService.getIdmTwoStatus();
    }
}
