package com.amrullah.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    // business service. Singleton.
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Awesome Description"),
                new Topic("java", "Core Java", "Mind-blowing Description"),
                new Topic("javascript", "JavaScript", "Superb Description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public Topic addTopic(Topic topic) {
        topics.add(topic);
        return topic;
    }


    public Topic updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);

            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return topic;
            }
        }
        return null;
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.remove(t);
            }
        }
    }
}
