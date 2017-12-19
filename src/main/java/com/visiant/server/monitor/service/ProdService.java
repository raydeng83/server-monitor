package com.visiant.server.monitor.service;

import com.visiant.server.monitor.domain.State;
import com.visiant.server.monitor.domain.StatusEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.visiant.server.monitor.SSLIgnoreUtil.disableSsl;

@Service
public class ProdService {

    private RestTemplate restTemplate = new RestTemplate();

    public StatusEntity getAmOneHttpStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("http://VCSIPWOAM01.visiantcloud.com:8080/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmOneSSLStatus () {
        StatusEntity se = new StatusEntity();
        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://VCSIPWOAM01.visiantcloud.com:8443/vauth/isAlive.jsp", String.class);
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

        ResponseEntity<String> entity = restTemplate.getForEntity("http://VCSIPWOAM02.visiantcloud.com:8080/vauth/isAlive.jsp", String.class);
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

        ResponseEntity<String> entity = restTemplate.getForEntity("https://VCSIPWOAM02.visiantcloud.com:8443/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmThreeHttpStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("http://VCSIPWOAM03.visiantcloud.com:8080/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmThreeSSLStatus () {
        StatusEntity se = new StatusEntity();
        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://VCSIPWOAM03.visiantcloud.com:8443/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmFourHttpStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("http://VCSIPWOAM04.visiantcloud.com:8080/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getAmFourSSLStatus () {
        StatusEntity se = new StatusEntity();
        disableSsl();

        ResponseEntity<String> entity = restTemplate.getForEntity("https://VCSIPWOAM04.visiantcloud.com:8443/vauth/isAlive.jsp", String.class);
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

        ResponseEntity<String> entity = restTemplate.getForEntity("https://iamnp.visiantcloud.com/vauth/isAlive.jsp", String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }
}
