package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.entity.Student;
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub	
//	Student student1 = new Student("Sushma","Bussu","sushma@gmail.com");
//	studentRepository.save(student1);
//	
//	Student student2 = new Student("Vishnu","vtg","vtg@gmail.com");
//	studentRepository.save(student2);
	
	}
	

}
