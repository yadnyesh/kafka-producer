package yb.yadnyesh.kafkaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloKafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendHelloToKafka(String name) {
		kafkaTemplate.send("t_hello", "Hello " + name);
	}
	

}
