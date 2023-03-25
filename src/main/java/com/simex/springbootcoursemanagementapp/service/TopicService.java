package com.simex.springbootcoursemanagementapp.service;

import com.simex.springbootcoursemanagementapp.data.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class  TopicService {
    private final List<Topic> topics =new ArrayList<>(Arrays.asList(new Topic("spring","java","Java course"),new Topic("exception","java exception","Java course"),new Topic("spring security","spring boot","Java course")));
    public  List<Topic> getAllTopics() {
        return  topics;
    }

    public Topic getTopic(String id) {
        Optional<Topic> optionalTopic = topics.stream().filter(t -> t.getId().equals(id)).findFirst();
        if(optionalTopic.isEmpty()){
            throw new IllegalStateException(id + " is not a topic");
        }
        return optionalTopic.get();

}

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {

        for (int i = 0; i < topics.size(); i++) {
            Topic top = topics.get(i);
            if (top.getId().equals(id)) {
                topics.set(i,  topic);
                return;
            }

        }
    }

    public void deleteTopic(String id) {
       topics.removeIf(top -> top.getId().equals(id));
//        for (Topic top : topics) {
//            if (top.getId().equals(id)) {
//                topics.remove(top);
//            }
//
//        }
    }
}
