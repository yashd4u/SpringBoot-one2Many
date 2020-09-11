package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResposeDTO;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.repository.CustomerRepositry;
import com.example.demo.repository.ProductRepository;

@Service
public class RelationshipService {

	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CustomerRepositry customerRepo;

	public Customer createCustomer(Customer entity) {

		return customerRepo.save(entity);
	}

	public Product createProduct(Product entity) {

		return productRepo.save(entity) ;
	}

	public List<ResposeDTO> getJoinInformation() {

		return customerRepo.getJoinInformation();
	}
	
}
