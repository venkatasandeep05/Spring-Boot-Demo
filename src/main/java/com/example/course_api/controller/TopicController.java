package com.example.course_api.controller;

import com.example.course_api.Entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController
{
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/addTopic")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/update")
     public void updateTopic(@RequestBody Topic topic)
    {
        topicService.UpdateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE ,value="/deleteTopicById/{id}")
     public void deleteTopic(@PathVariable("id") Integer id)
    {
        topicService.deleteTopic(id);
    }

    @GetMapping("/getTopicByID/{id}")
    public Optional<Topic> getTopicById(@PathVariable("id") Integer id)
    {
        return topicService.getTopicById(id);
    }
}
