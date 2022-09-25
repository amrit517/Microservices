package com.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User service is down at this time";	
	}
	
	@GetMapping("/contactServiceFallBack")
	public String contactServiceFallBack() {
		return "Contact service is down at this time";	
	}

}
