package yb.yadnyesh.kafkaproducer;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import yb.yadnyesh.kafkaproducer.entity.Employee;
import yb.yadnyesh.kafkaproducer.producer.EmployeeJsonProducer;
import yb.yadnyesh.kafkaproducer.producer.HelloKafkaProducer;
import yb.yadnyesh.kafkaproducer.producer.KafkaKeyProducer;

@SpringBootApplication
//@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 5; i++) {
			var employee = new Employee("emp-" + i, "Employee " + i, LocalDate.now());
			Thread.sleep(500);
			employeeJsonProducer.sendMessageToKafka(employee);
		}
	}

}
