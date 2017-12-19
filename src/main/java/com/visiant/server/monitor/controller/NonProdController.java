package com.visiant.server.monitor.controller;

import com.visiant.server.monitor.domain.StatusEntity;
import com.visiant.server.monitor.service.NonProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/NonProd")
public class NonProdController {

    @Autowired
    private NonProdService  nonProdService;

    @RequestMapping("/am1http")
    public StatusEntity getAmOneHttpStatus(){
        return nonProdService.getAmOneHttpStatus();
    }

    @RequestMapping("/am1https")
    public StatusEntity getAmOneSSLStatus(){
        return nonProdService.getAmOneSSLStatus();
    }

    @RequestMapping("/am2http")
    public StatusEntity getAmTwoHttpStatus(){
        return nonProdService.getAmTwoHttpStatus();
    }

    @RequestMapping("/am2https")
    public StatusEntity getAmTwoSSLStatus(){
        return nonProdService.getAmTwoSSLStatus();
    }

    @RequestMapping("/amLoadBalancer")
    public StatusEntity getAmLoadBalancerStatus(){
        return nonProdService.getLoadBalancerStatus();
    }
}
