package com.resourceService.resourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ResourceServiceApplication {

	@Autowired
	private Resource resource;

	public ResourceServiceApplication(Resource resource){
		this.resource = resource;
	}
	public static void main(String[] args) {
		SpringApplication.run(ResourceServiceApplication.class, args);
	}

}
