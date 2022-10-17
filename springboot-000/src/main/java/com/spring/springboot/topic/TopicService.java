package com.spring.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring Framework", 1, "New spring framework with examples"), 
			new Topic("Java", 2, "Java with OOPS")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(int id, Topic topic) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId() == id) {
				topics.set(i, topic);
			}
		}
		
	}
	public void deleteTopic(int id) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId() == id) {
				topics.remove(i);
			}
		}
	}


}
