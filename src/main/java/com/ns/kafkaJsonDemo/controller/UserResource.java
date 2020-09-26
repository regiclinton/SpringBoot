package com.ns.kafkaJsonDemo.controller;

// Java program to implement a
// controller

import com.ns.kafkaJsonDemo.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gfg")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, Student>
            kafkaTemplate;

    private static final String TOPIC
            = "StudentExample ";


    @GetMapping("/publish/{id}/"
            + "{firstName}/{lastName}")

    public String post(
            @PathVariable("id") final int id,
            @PathVariable("firstName") final
            String firstName,
            @PathVariable("lastName") final
            String lastName)
    {

        kafkaTemplate.send(
                TOPIC,
                new Student(
                        id, firstName,
                        lastName));

        return "Published successfully";
    }
}

