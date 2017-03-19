package io.javapro.starter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics") //JSON will be the output, spring mvc does the conversion
	public List<Topic> getAllTopics(){
		return topicservice.getAllTopics();
	}
	
	//Map this method to any GET request on "/topics"
	@RequestMapping("/topics/{id}") //{}--used to specify token for lookup 
	public Topic getTopic(@PathVariable String id) // pass the variable to this parameter i.e. {id} to id
	{
		return topicservice.getTopic(id);
	}
	
	//Map this method to any POST request on "/topics"
	@RequestMapping(method = RequestMethod.POST, value="/topics") // For POST, need to pass method and the value will be the URL
	public void addTopic(@RequestBody Topic topic) // Tells spring mvc to pick this request body and convert it into topic instance and add it to method
	{
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}") // For PUT, need to pass method and the value will be the URL and the element
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) // Tells spring mvc to pick this request body and convert it into topic instance and add it to method
	{
		topicservice.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}") // For DELETE, need to pass method and the value will be the URL and the element
	public void deleteTopic(@PathVariable String id) // Tells spring mvc to pick this request body and convert it into topic instance and add it to method
	{
		topicservice.deleteTopic(id);
	}
	
}
