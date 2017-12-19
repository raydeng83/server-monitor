package com.visiant.server.monitor.controller;

import com.visiant.server.monitor.domain.StatusEntity;
import com.visiant.server.monitor.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Prod")
public class ProdController {
    @Autowired
    private ProdService prodService;

    @RequestMapping("/am1http")
    public StatusEntity getAmOneHttpStatus(){
        return prodService.getAmOneHttpStatus();
    }

    @RequestMapping("/am1https")
    public StatusEntity getAmOneSSLStatus(){
        return prodService.getAmOneSSLStatus();
    }

    @RequestMapping("/am2http")
    public StatusEntity getAmTwoHttpStatus(){
        return prodService.getAmTwoHttpStatus();
    }

    @RequestMapping("/am2https")
    public StatusEntity getAmTwoSSLStatus(){
        return prodService.getAmTwoSSLStatus();
    }

    @RequestMapping("/am3http")
    public StatusEntity getAmThreeHttpStatus(){
        return prodService.getAmThreeHttpStatus();
    }

    @RequestMapping("/am3https")
    public StatusEntity getAmThreeSSLStatus(){
        return prodService.getAmThreeSSLStatus();
    }

    @RequestMapping("/am4http")
    public StatusEntity getAmFourHttpStatus(){
        return prodService.getAmFourHttpStatus();
    }

    @RequestMapping("/am4https")
    public StatusEntity getAmFourSSLStatus(){
        return prodService.getAmFourSSLStatus();
    }

    @RequestMapping("/amLoadBalancer")
    public StatusEntity getAmLoadBalancerStatus(){
        return prodService.getLoadBalancerStatus();
    }
}
