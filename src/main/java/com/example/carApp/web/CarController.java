package com.example.carApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carApp.domain.Car;
import com.example.carApp.domain.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository carRepo;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return carRepo.findAll();
	}
	
}
