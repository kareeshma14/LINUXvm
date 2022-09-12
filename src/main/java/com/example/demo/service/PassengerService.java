package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;

@Service
public class PassengerService {
private static List<Passenger> em = new ArrayList<>();
	
	
	public PassengerService() {
		em = putPassengers();
	}
	private List<Passenger> putPassengers(){
		List<Passenger> list = new ArrayList<>();
		list.add(new Passenger(101, "Ross", 19, "CHN", "DEL"));
		list.add(new Passenger(102, "Rachel", 29, "DEL", "BLR"));
		list.add(new Passenger(103, "Monica", 49, "BLR", "HYD"));
		list.add(new Passenger(104, "Chandler", 20, "DEL", "MUM"));
		list.add(new Passenger(105, "Joey", 33 , "CHN", "DEL"));
		list.add(new Passenger(106, "Phoebe", 23, "CHN", "DEL"));
		list.add(new Passenger(107, "Klaus",24, "CHN", "DEL"));
		list.add(new Passenger(108, "Hope",25, "CHN", "DEL"));
		list.add(new Passenger(109, "Hailey",23, "CHN", "DEL"));
		list.add(new Passenger(110, "Harrys",34, "CHN", "DEL"));
		return list;
	}
	public List<Passenger> getAll() {
		return em;
	}
	public Passenger getById(int id) {
		return em.stream().filter(x -> x.getId() == id).findFirst().get();
	}
}
