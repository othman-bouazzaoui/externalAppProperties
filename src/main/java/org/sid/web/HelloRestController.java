package org.sid.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@RequestMapping( value = "/hello", method = RequestMethod.GET)
	public String sayHelllo() {
		System.out.println("Othman");
		return "Hello Ssi Othman";
	}
	
	@RequestMapping(value ="/post", method = RequestMethod.POST)
	public String add(@RequestBody String obj) {
		return "POST Method : " + obj;
	}
	
	@RequestMapping(value ="/put", method = RequestMethod.PUT)
	public String update(@RequestBody String obj) {
		return "PUT Method :" + obj;
	}
	
	@RequestMapping(value ="/del", method = RequestMethod.DELETE)
	public String delete(@RequestBody String obj) {
		return "DELETE Method :" +obj;
	}

}
