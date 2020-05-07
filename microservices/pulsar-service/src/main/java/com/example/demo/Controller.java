package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Value("${everesst.pulsar}")
    private String pulsarEnabled;

    @Value("${everesst.kafka}")
    private String kafkaEnabled;

    @Value("${everesst.other.kafka}")
    private String otherKafkaProperty;

    @GetMapping("/config")
    public Map<String, String> config() {
        HashMap<String, String> config = new HashMap<>();
        config.put("pulsar", pulsarEnabled);
        config.put("kafka", kafkaEnabled);
        config.put("other.kafka", otherKafkaProperty);
        return config;
    }
}
