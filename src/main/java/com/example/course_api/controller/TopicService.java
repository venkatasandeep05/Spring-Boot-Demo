package com.example.course_api.controller;

import com.example.course_api.Entity.Topic;
import com.example.course_api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService
{
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopics()
    {
        return topicRepository.findAll();
    }

    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
    }

    public void UpdateTopic(Topic topic)
    {
        topicRepository.save(topic);
    }

    public void deleteTopic(Integer id)
    {
        topicRepository.deleteById(id);
    }

    public Optional<Topic> getTopicById(Integer id)
    {
        return topicRepository.findById(id);
    }
}
