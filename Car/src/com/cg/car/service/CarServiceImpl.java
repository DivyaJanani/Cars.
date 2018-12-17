package com.cg.car.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.car.bean.Customer;
import com.cg.car.bean.Cars;
import com.cg.car.dao.CarsDAO;
import com.cg.car.dao.CarsDAOImpl;
import com.cg.car.exception.CarException;

public class CarServiceImpl implements CarService{
		CarsDAO cDAO=new CarsDAOImpl();
	
	public void buyCar(Customer customer,Cars car) throws Exception {
		//System.out.println("In service");
		cDAO.buyCar(customer,car);
		
	}

	public Cars searchCar(String carmodel,String cartype) throws Exception {
		
		Cars car=new Cars();
		String Model=carmodel;
		String Type=cartype;
		car=cDAO.searchCar(carmodel,cartype);
		return car;
	}


	public List showStock() {
		List<Cars> li=new ArrayList<Cars>();
		li=cDAO.showStock();
		
		return li;
	}
	
	
	public void validation(Customer customer) throws CarException
	 {
		
		List validationerrors=new ArrayList();
		if(!isValidName(customer.getCustomerName()))
		{
					validationerrors.add("Name should be minimum of 3 and first letter should be capital"
							+ " characters");
		}
		
		if(!isValidPhone(customer.getCustomerNumber()))
		{
					validationerrors.add("Number should be only digits and 10 in length");
		}
		if(!validationerrors.isEmpty())
		{
					throw new CarException(validationerrors+"\n");
		}
		if(!(isValidAddress(customer.getAddress())))
		{
			validationerrors.add("\n address should be greater than 5 characters");
			
		}
		
	}
	
	private boolean isValidAddress(String address) {
	
		
		return (address.length()>6);	
		
		
	}

	public void carValidation(Cars car) throws CarException
	{
		
		List validationerror=new ArrayList();
		if(!isValidCar(car.getCarmodel()))
		{
			validationerror.add("car not available");
		}
		if(!validationerror.isEmpty())
		{
			throw new CarException(validationerror+"\n");
		}
		
	}
	
	
	
	public boolean isValidName(String cname)
	{
		Pattern p=Pattern.compile("[A-Z][a-z]{3,}");
		Matcher m=p.matcher(cname);
		return m.matches();
	}
	public boolean isValidPhone(String cphone)
	{
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher(cphone);
		return m.matches();
		
	}	
	public boolean isValidCar(String Car)
	{
		String car1=Car;
		
		if(car1.equals("benz")||car1.equals("jaguar")||car1.equals("maruthi"))
		{
			
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
}


