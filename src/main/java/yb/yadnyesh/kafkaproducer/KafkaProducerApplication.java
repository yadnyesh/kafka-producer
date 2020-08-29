package yb.yadnyesh.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import yb.yadnyesh.kafkaproducer.producer.HelloKafkaProducer;

@SpringBootApplication
@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
