package com.cg.car.bean;

public class Cars {
	private String carmodel;
	private String cartype;
	private String carmileage;
	private String carcc;
	private double speed; 
	private int availability;
	
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getCarmileage() {
		return carmileage;
	}
	public void setCarmileage(String carmileage) {
		this.carmileage = carmileage;
	}
	public String getCarcc() {
		return carcc;
	}
	public void setCarcc(String carcc) {
		this.carcc = carcc;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String toString() {
		return "Cars [carmodel=" + carmodel + ", cartype=" + cartype
				+ ", carmileage=" + carmileage + ", carcc=" + carcc
				+ ", speed=" + speed + "]";
	}
}		