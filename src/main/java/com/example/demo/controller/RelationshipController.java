package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResposeDTO;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;

import com.example.demo.service.RelationshipService;

@RestController
public class RelationshipController {
	@Autowired
	private RelationshipService service;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer entity) {

		return service.createCustomer(entity);
	}

	@PostMapping("/product")
	public Product createProduct(Product entity) {

		return service.createProduct(entity);
	}

	@GetMapping("/joinInfo")
	public List <ResposeDTO> getJoinData() {
		return service.getJoinInformation();

	}

}
