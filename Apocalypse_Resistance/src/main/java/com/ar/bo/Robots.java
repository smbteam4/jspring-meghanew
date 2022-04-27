package com.ar.bo;

public class Robots {

	private String model;
	private String serialNumber;
	private String manufacturedDate;
	private String category;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Robots(String model, String serialNumber, String manufacturedDate, String category) {
		this.model = model;
		this.serialNumber = serialNumber;
		this.manufacturedDate = manufacturedDate;
		this.category = category;
	}
	public Robots() {
		
	}
	@Override
	public String toString() {
		return "Robots [model=" + model + ", serialNumber=" + serialNumber + ", manufacturedDate=" + manufacturedDate
				+ ", category=" + category + "]";
	}
	
	

}
