package com.arc.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderTest {
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	public KafkaSenderTest(KafkaTemplate<String, String> kafkaTemplate){
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void send(String message, String kafkaTopic) {
	    
	    kafkaTemplate.send(kafkaTopic, message);
	}
}