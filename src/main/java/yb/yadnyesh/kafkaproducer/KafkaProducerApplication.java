package yb.yadnyesh.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import yb.yadnyesh.kafkaproducer.producer.HelloKafkaProducer;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner{
	
	@Autowired
	private HelloKafkaProducer helloKafkaProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloKafkaProducer.sendHelloToKafka("Yadnyesh " + Math.random());
		
	}

}
