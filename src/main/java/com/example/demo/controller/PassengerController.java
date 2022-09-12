package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.service.PassengerService;


@RestController
public class PassengerController {
	@Autowired
	private PassengerService service;
	
	@GetMapping("/passenger")
	public List<Passenger> getPassengers(){
		return service.getAll();
	}
	@GetMapping("/passenger/{id}")
	public Passenger getPassenger(@PathVariable int id) {
		return service.getById(id);
	}
}
