package com.visiant.server.monitor.controller;

import com.visiant.server.monitor.domain.StatusEntity;
import com.visiant.server.monitor.service.SunGuardService;
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

    @RequestMapping("/am1http")
    public StatusEntity getAmOneHttpStatus(){
        return sunGuardService.getAmOneHttpStatus();
    }

    @RequestMapping("/am1https")
    public StatusEntity getAmOneSSLStatus(){
        return sunGuardService.getAmOneSSLStatus();
    }

    @RequestMapping("/am2http")
    public StatusEntity getAmTwoHttpStatus(){
        return sunGuardService.getAmTwoHttpStatus();
    }

    @RequestMapping("/am2https")
    public StatusEntity getAmTwoSSLStatus(){
        return sunGuardService.getAmTwoSSLStatus();
    }

    @RequestMapping("/amLoadBalancer")
    public StatusEntity getAmLoadBalancerStatus(){
        return sunGuardService.getLoadBalancerStatus();
    }


}
