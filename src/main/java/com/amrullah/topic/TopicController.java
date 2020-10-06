package com.amrullah.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Awesome Description"),
                new Topic("java", "Core Java", "Mind-blowing Description"),
                new Topic("javascript", "JavaScript", "Superb Description")
        );
    }
}
