package com.visiant.server.monitor.service;

import com.visiant.server.monitor.domain.State;
import com.visiant.server.monitor.domain.StatusEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.visiant.server.monitor.SSLIgnoreUtil.disableSsl;

@Service
public class SunGuardService {

    private RestTemplate restTemplate = new RestTemplate();

    public StatusEntity getAmOneHttpStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("http://MDWIAMPHX03.ikasystems.com:8080/visiantauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/x-www-form-urlencoded");
//        HttpEntity<String> request = new HttpEntity<String>("response_type=access_token&scope=openid+profile&client_id=Inovaare&client_secret=jwtauth%23visiant%24key&grant_type=password&username=IAMU_Monitor&password=Cangetin!1",headers);
//
//        entity = restTemplate.exchange("https://vcsiqwoam01.visiantcloud.com:8443/vauth/oauth2/access_token?realm=Premera-TEST-C", HttpMethod.POST, request, String.class);
//        if(entity.getStatusCode().is2xxSuccessful()){
//            se.setoAuthTokenAvailable(State.RUNNING);
//        } else {
//            se.setoAuthTokenAvailable(State.DOWN);
//        }

        return se;
    }

    public StatusEntity getAmOneSSLStatus () {
        StatusEntity se = new StatusEntity();
        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://MDWIAMPHX03.ikasystems.com:8443/visiantauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmTwoHttpStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("http://MDWIAMPHX04.ikasystems.com:8080/visiantauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmTwoSSLStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://MDWIAMPHX04.ikasystems.com:8443/visiantauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getLoadBalancerStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://openam.ikadev.com/visiantauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }



}
