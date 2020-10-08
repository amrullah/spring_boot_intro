package com.amrullah.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    // business service. Singleton.
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Awesome Description"),
                new Topic("java", "Core Java", "Mind-blowing Description"),
                new Topic("javascript", "JavaScript", "Superb Description")
        ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    public Topic addTopic(Topic topic) {
        topicRepository.save(topic);
        return topic;
    }


    public Topic updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
        return topic;
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
