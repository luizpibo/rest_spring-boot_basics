package br.com.ParametersAndExceptionHandler.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.ParametersAndExceptionHandler.exceptions.UnsupportedMathOperationException;
import br.com.ParametersAndExceptionHandler.numberConverters.NumberConverter;
import br.com.ParametersAndExceptionHandler.utils.SimpleMath;

@RestController
public class MathController {
	@GetMapping("/sum/{num1}/{num2}")
	public Double sum(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2)
			throws Exception {
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.sum(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

	}
	
	@GetMapping("/multiplication/{num1}/{num2}")
	public Double multiplication(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2)
			throws Exception {
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.multiplication(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

	}
	
	@GetMapping("/division/{num1}/{num2}")
	public Double division(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2)
			throws Exception {
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.division(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

	}

	@GetMapping("/mean/{num1}/{num2}")
	public Double mean(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2)
			throws Exception {
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.mean(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

	}

	@GetMapping("/pow/{num1}/{num2}")
	public Double pow(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2)
			throws Exception {
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.pow(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2));

	}

	@GetMapping("/squareRoot/{num1}")
	public Double squareRoot(@PathVariable(value = "num1") String num1) throws Exception {
		if (!NumberConverter.isNumeric(num1)) {
			throw new UnsupportedMathOperationException("santo amaro");
		}
		return SimpleMath.squareRoot(NumberConverter.convertToDouble(num1));

	}

}
