package com.restful.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restful.json.CustomerJSON;

@Controller
public class CustomerController {
	
	private static ArrayList<CustomerJSON> customers = new ArrayList<CustomerJSON>();
	
	static {
		customers.add(new CustomerJSON("Jon", "Snow"));
		customers.add(new CustomerJSON("Tyrion", "Lanister"));
	}

	@RequestMapping(value = "/customers")
	public @ResponseBody ArrayList<CustomerJSON> getAllCustomers() {
		return customers;
	}
}
