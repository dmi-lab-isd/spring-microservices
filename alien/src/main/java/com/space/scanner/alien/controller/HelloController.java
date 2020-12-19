package com.space.scanner.alien.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import com.space.scanner.alien.bean.Planet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Check:
 * http://localhost:9090/v2/api-docs (json doc)
 * http://localhost:9090/swagger-ui.html (UI doc)
 */
@RestController
public class HelloController {
	@Autowired
	Planet planet;
	
	@ApiOperation("Just to say hello from the planet")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String index() {
		 return "Greetings from " + planet.getGreetings() + "!";
	 }

}
