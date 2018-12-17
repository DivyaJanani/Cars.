package com.cg.car.service;

	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.List;

	import com.cg.car.bean.Customer;
	import com.cg.car.bean.Cars;

	public interface CarService {
			
		public void buyCar(Customer customer,Cars car) throws Exception;
		public Cars searchCar(String modelnaem,String modelno) throws Exception;
		public List showStock();
		
		
	}


