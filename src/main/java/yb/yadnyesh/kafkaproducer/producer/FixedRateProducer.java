package yb.yadnyesh.kafkaproducer.producer;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//@Service
public class FixedRateProducer {
	
	private Logger log = org.slf4j.LoggerFactory.getLogger(FixedRateProducer.class);
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	private int i = 0;
	
	@Scheduled(fixedRate = 1000)
	public void sendMessage() {
		i++;
		log.info("i is: " + i);
		kafkaTemplate.send("t_fixedrate_2", "Fixed Rate" + i);
	}

}
