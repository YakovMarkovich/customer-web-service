package main.java.m2m.controller;

import main.java.m2m.service.ServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerWebServiceController {

    @Autowired
    ServiceConsumer service;

    @GetMapping("/CustomerAverageScore/{consumerId}")
    public double getAvgValue(@PathVariable String consumerId) {
        return service.getAvgValue(consumerId);
    }
}
