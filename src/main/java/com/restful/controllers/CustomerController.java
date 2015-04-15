package com.restful.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	@RequestMapping(value = "/customers")
	public @ResponseBody String getAllCustomers() {
		return "ALL CUSTOMERS";
	}
}
