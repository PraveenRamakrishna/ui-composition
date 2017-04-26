package com.example.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.domain.Menu;
import com.example.domain.Order;

@Controller
public class CompositionController {

	@Value("${welcome.message}")
	private String message = "Hello World";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		RestTemplate restTemplate = new RestTemplate();
        
		Order order = restTemplate.getForObject("http://localhost:4010/orders",Order.class);
		
		Menu[] menus = restTemplate.getForObject("http://localhost:4020/menu",Menu[].class);
        
		model.put("order", order);
		model.put("menuList", Arrays.asList(menus));
		model.put("message", this.message);
		return "home";
	}

}
