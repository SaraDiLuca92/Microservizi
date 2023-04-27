package com.es.esercizio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;



@RestController
@RequestMapping("/os")
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get-string")
    public String getString() {
        String url = "http://localhost:8082/app/data1";
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/get-people")
    public List<List<String>> getPeople() {
        String url = "http://localhost:8082/app/data2";
        ResponseEntity<List<List<String>>> response = restTemplate.exchange(
            url, HttpMethod.GET, null, new ParameterizedTypeReference<List<List<String>>>() {});
        return response.getBody();
    }

    @GetMapping(value = "/get-people-json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Persona>> getPeopleJson() {
        String url = "http://localhost:8082/app/data3";
        ResponseEntity<List<Persona>> response = restTemplate.exchange(
            url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Persona>>() {});
        return ResponseEntity.ok(response.getBody());
    }
}

