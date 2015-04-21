package com.restful.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restful.json.CustomerJSON;

/**
 * Customer Service.
 * 
 * @author NCANDREV
 *
 */
@Controller
public class CustomerController {
	
	//This will hold all of the customers.
	private static ArrayList<CustomerJSON> customers = new ArrayList<CustomerJSON>();
	
	static {
		customers.add(new CustomerJSON("Jon", "Snow"));
		customers.add(new CustomerJSON("Tyrion", "Lanister"));
	}

	@RequestMapping(value = "/customers")
	public @ResponseBody ArrayList<CustomerJSON> getAllCustomers() {
		return customers;
	}
	
	private void testMethod() {
		System.out.println("This is a test method");
	}
	
	private void testMethod2() {
		System.out.println("this is a test method 2.");
	}
}
