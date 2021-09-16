package com.tuts.kafkaBoot.resources;

import com.tuts.kafkaBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    private static final String TOPIC = "topicTest";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @GetMapping("/publish/{name}")
    public String publish(@PathVariable("name") final String name){

        kafkaTemplate.send(TOPIC, new User(name, "Tecnologia", 7500000L));

        return "Published Succesfully";

    }
}
