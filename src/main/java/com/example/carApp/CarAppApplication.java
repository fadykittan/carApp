package com.example.carApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.carApp.domain.Car;
import com.example.carApp.domain.CarRepository;
import com.example.carApp.domain.Owner;
import com.example.carApp.domain.OwnerRepository;




@SpringBootApplication
public class CarAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(CarAppApplication.class);

	@Autowired
	private CarRepository carRepo;
	@Autowired
	private OwnerRepository ownerRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CarAppApplication.class, args);
		// rain
		logger.info("Hello Spring Boot");

	}
	
	
	
	@Bean
    CommandLineRunner runner(){
      return args -> {
    	 Owner o1 = new Owner("aa","vv");
    	 Owner o2 = new Owner("aa","bb");
    	 Owner o3 = new Owner("cc","nn");
    	 
    	 // save demo data
    	 ownerRepo.save(o1);
    	 ownerRepo.save(o2);
    	 ownerRepo.save(o3);
    	 
        // Save demo data to database
    	carRepo.save(new Car(o1 , "Ford", "Mustang", "Red",
         "ADF-1121", 2017, 59000));
    	carRepo.save(new Car(o2, "Nissan", "Leaf", "White",
         "SSJ-3002", 2014, 29000));    
    	carRepo.save(new Car(o3 , "Toyota", "Prius", "Silver",
         "KKO-0212", 2018, 39000));
      };
    } 


	
	

}
