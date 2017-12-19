package com.visiant.server.monitor.service;

import com.visiant.server.monitor.domain.State;
import com.visiant.server.monitor.domain.StatusEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.visiant.server.monitor.SSLIgnoreUtil.disableSsl;

@Service
public class TestCService {
    private RestTemplate restTemplate = new RestTemplate();

    public StatusEntity getIdmOneStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("X-OpenIDM-Username", "IAMU_Monitor");
        headers.add("X-OpenIDM-Password", "Cangetin!1");
        HttpEntity<String> request = new HttpEntity<String>( headers);

        ResponseEntity<String> entity = restTemplate.exchange("https://VCSIQWOIDM01.visiantcloud.com:18443/openidm/info/ping", HttpMethod.GET, request, String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }

    public StatusEntity getIdmTwoStatus () {
        StatusEntity se = new StatusEntity();

        disableSsl();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("X-OpenIDM-Username", "IAMU_Monitor");
        headers.add("X-OpenIDM-Password", "Cangetin!1");
        HttpEntity<String> request = new HttpEntity<String>( headers);

        ResponseEntity<String> entity = restTemplate.exchange("https://VCSIQWOIDM02.visiantcloud.com:18443/openidm/info/ping", HttpMethod.GET, request, String.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            se.setAlive(State.RUNNING);
        } else {
            se.setAlive(State.DOWN);
        }

        return se;
    }
}
