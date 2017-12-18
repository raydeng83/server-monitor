package com.visiant.server.monitor.service;

import com.visiant.server.monitor.domain.StatusEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.visiant.server.monitor.SSLIgnoreUtil.disableSsl;

@Service
public class SunGuardService {

    @Value("${sunguard.am1.url}")
    private String uriAlive;


    public StatusEntity getAmOneStatus () {
        StatusEntity se = new StatusEntity();
        RestTemplate restTemplate = new RestTemplate();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity(uriAlive, String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(true);
        }

        return se;
    }

}
