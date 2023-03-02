package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class ApiController {
	public List<Address> createAdd(){
		List<Address> l=new ArrayList<Address>();
		l.add(new Address("Rolex","001,Anna nagar",560076));
		l.add(new Address("Mr.D","002,Anna nagar",560076));
		l.add(new Address("Sai","003,Anna nagar",560076)); 
		l.add(new Address("Solomon","004,Anna nagar",560076));
		l.add(new Address("Aadi","005,Anna nagar",560076));
		l.add(new Address("Ameen","006,Anna nagar",560076));
		return l;
	}
@GetMapping("/")
public List<Address> getAddress() {
	return createAdd();
	}
}
