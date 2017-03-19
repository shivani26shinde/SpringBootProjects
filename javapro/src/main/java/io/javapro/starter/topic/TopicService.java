package io.javapro.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //Marks a class like business service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "SpringFramework","Des1"), 
			new Topic("Java", "JavaCore", "Des2"), 
			new Topic("C", "CCore","des3")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getID().equals(id)).findFirst().get(); // t--> t is a Lamda expression for iterating over the topics
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic){
		for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
			if(t.getID().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id){
		topics.removeIf(t -> t.getID().equals(id));
	}
}
