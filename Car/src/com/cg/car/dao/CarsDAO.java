package com.cg.car.dao;
import java.io.IOException;
	import java.sql.SQLException;
	import java.util.List;

	import com.cg.car.bean.Customer;
	import com.cg.car.bean.Cars;

	public interface CarsDAO {

		public void buyCar(Customer customer,Cars car) throws Exception;
		public Cars searchCar(String modelname,String modelno) throws  Exception;
		public List showStock();
	}


