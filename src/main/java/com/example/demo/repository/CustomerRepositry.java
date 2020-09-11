package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.ResposeDTO;
import com.example.demo.entity.Customer;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer, Integer>{
	
	
	@Query("SELECT new com.example.demo.dto.ResposeDTO(c.name, c.address, p.productName, p.quantity,  p.price) FROM Customer c JOIN c.products p")
	public List<ResposeDTO> getJoinInformation();

}
