package com.cg.car.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.car.bean.Customer;
import com.cg.car.bean.Cars;
import com.cg.car.util.DBConnection;

public class CarsDAOImpl implements CarsDAO {

	
	public void buyCar(Customer customer,Cars car) throws Exception {
		
		//Cars cars=new Cars();
		String model=car.getCarmodel();
		String cartype=car.getCartype();
		System.out.println(model);
		System.out.println(customer.getCustomerName());
		
		try
		{
			Connection connection=DBConnection.getConnection();
		
		PreparedStatement pS=connection.prepareStatement("insert into customer values(?,?,?,?,?,sysdate,id.nextval)");
		pS.setString(1,customer.getCustomerName());
		pS.setString(2,customer.getCustomerNumber());
		pS.setString(3,customer.getAddress());
		pS.setString(4,cartype);
		pS.setString(5,model);
		pS.executeUpdate();
		
		Statement s=connection.createStatement();
		s.executeUpdate("update cars set availability=availability-1 where carmodel='"+model+"' and cartype='"+cartype+"'");
		connection.close();
		}
		
		catch(Exception e)
		{
			
		}
	}

	
	public Cars searchCar(String model,String type) throws Exception {
		// TODO Auto-generated method stub
		String carModel=model;
		String carType=type;
		
		Cars car=new Cars();
		try
		{
		Connection connection=null;
		connection=DBConnection.getConnection();
		
		Statement s=connection.createStatement();
		ResultSet rS=s.executeQuery("select * from cars where carModel='"+model+"' and carType='"+type+"'");
		
		while(rS.next())
		{
			
			String n=rS.getString(1);
			String n1=rS.getString(2);
			int a=rS.getInt(3);
			double b=rS.getDouble(4);
			car.setCarmodel(n1);
			car.setCarmileage(n);
			car.setSpeed(b);
			car.setCartype(car.getCartype());
		}
		
		connection.close();
		}
		
		catch(Exception s)
		{
			s.printStackTrace();
		}
		return car;
	}

	
	public List showStock() {
		List<Cars> li=new ArrayList<Cars>();
		
		try
		{
		Connection connection=null;
		connection=DBConnection.getConnection();
		
		Statement s=connection.createStatement();
		ResultSet rS=s.executeQuery("select * from cars");
		
		while(rS.next())
		{
			Cars car=new Cars();
			car.setCarmodel(rS.getString(1));
			car.setCarmileage(rS.getString(2));
			car.setSpeed(rS.getDouble(3));
			
			li.add(car);	
			
		}
		connection.close();
		}
		
		catch(Exception s)
		{
			s.printStackTrace();
		}

		return li;
	}

	
	public Cars searchCars(String Carmodel, String Cartype) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
