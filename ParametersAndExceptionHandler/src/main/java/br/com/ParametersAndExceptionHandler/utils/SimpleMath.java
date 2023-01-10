package br.com.ParametersAndExceptionHandler.utils;

public class SimpleMath {
	
	public static Double sum(Double num1, Double num2) {
		return num1 + num2;
	}

	public static Double multiplication(Double num1, Double num2) {
		return num1 * num2;
	}

	public static Double division(Double num1, Double num2) {
		return num1 / num2;
	}

	public static Double mean(Double num1, Double num2) {
		return (sum(num1, num2)) / 2;
	}

	public static Double pow(Double num1, Double num2) {
		return Math.pow(num1, num2);
	}

	public static Double squareRoot(Double num) {
		return Math.sqrt(num);
	}
}
