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
@RequestMapping("/TestC")
public class TestCController {
    @Autowired
    private TestCService testCService;


}
