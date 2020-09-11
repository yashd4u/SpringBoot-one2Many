package com.example.demo.dto;

public class ResposeDTO {

	@Override
	public String toString() {
		return "ResposeDTO [name=" + name + ", address=" + address + ", productName=" + productName + ", quantity="
				+ quantity + ", price=" + price + "]";
	}

	public ResposeDTO(String name, String address, String productName, Integer quantity, double price) {
		super();
		this.name = name;
		this.address = address;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
 public ResposeDTO(){
		
		
	}

	private String name;

	private String address;

	private String productName;
	private Integer quantity;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
