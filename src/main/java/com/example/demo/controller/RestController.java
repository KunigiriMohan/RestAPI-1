package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @RequestMapping : to set URL path
 * @org.springframework.web.bind.annotation.RestController : RestController
 * @RequestParam:to pass the value as parameter.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
	@RequestMapping(value = {"","/","home"})
	public String sayHello() {
		return "Hello From BridgeLabz";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHell(@RequestParam(value = "name") String name) {
		return "Hello " + name + " ! ";
	}

}
