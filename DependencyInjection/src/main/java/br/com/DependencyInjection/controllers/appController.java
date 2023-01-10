package br.com.DependencyInjection.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
	@GetMapping("/")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("teste");

	}

}
