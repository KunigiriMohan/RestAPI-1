package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;

/**
 * @RequestMapping : to set URL path
 * @org.springframework.web.bind.annotation.RestController : RestController
 * @RequestParam:to pass the value of a parameter.
 * @GetMapping : to pass the value of a parameter.
 * @PostMapping : to post the firstName and lastName parameter to user class
 * @RequestedBody : getting object of user class
 * @PathVariable : extracting variables localhost URI
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
	
	@GetMapping ("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + " ! ";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() +" ! ";
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return "Hello "+ firstName + " "+ lastName + "!";
	}

}
