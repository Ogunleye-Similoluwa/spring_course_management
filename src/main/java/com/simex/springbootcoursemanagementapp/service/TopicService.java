package com.simex.springbootcoursemanagementapp.service;

import com.simex.springbootcoursemanagementapp.data.model.model.Topic;
import com.simex.springbootcoursemanagementapp.data.model.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class  TopicService {

    @Autowired
    private TopicRepository topicRepository;
    public  List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        if(optionalTopic.isEmpty()){
            throw new IllegalStateException(id + " is not a topic");
        }
        return optionalTopic.get();

}

    public void addTopic(Topic topic) {
        topicRepository.save(topic);

    }

    public void updateTopic(String id, Topic topic) {
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        if(optionalTopic.isEmpty()){
            throw new IllegalStateException(id + " is not a topic");
        }
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);

    }
}
