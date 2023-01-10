package br.com.DependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.DependencyInjection.services.AppService;

@RestController
public class AppController {
	
	@Autowired
	public final AppService appService = new AppService();
	
	
	@GetMapping("/")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("teste");

	}

}
