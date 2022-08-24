package com.jap.calculator;

public class ScientificCalculator {

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println("Ceil of Number =" + scientificCalculator.cielOfANumber(10));
		} catch (CalculatorException e) {
			System.out.println(e);
			;
		}
		try {
			System.out.println("Floor of Number =" + scientificCalculator.floorOfANumber(20));
		} catch (CalculatorException e) {
			System.out.println(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			System.out.println("Power of Number =" + scientificCalculator.power(5, 2));
		} catch (CalculatorException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Square root of Number =" + scientificCalculator.squareRoot(5));
		} catch (CalculatorException e) {
			System.out.println(e);
		}

		MathematicalCalculator mathematicalCalculator = new MathematicalCalculator();

		System.out.println("Addition of integer number = " + mathematicalCalculator.add(10, 20));
		System.out.println("Subtraction of integer number = " + mathematicalCalculator.subtract(50, 20));
		System.out.println("Multiplication of integer number = " + mathematicalCalculator.multiply(10, 5));
		System.out.println("Division of integer number = " + mathematicalCalculator.divide(10, -5));
		System.out.println("Modulo of integer number = " + mathematicalCalculator.add(50, 20));
	}

	public double cielOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("Number should not be negative or zero");
		} else {
			return Math.ceil(num);
		}
	}
	
	public double floorOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("Number should not be negative or zero");
		} else {
			return Math.floor(num);
		}
	}

	public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if (num1 < num2) {
			throw new CalculatorException("Number1 should be greater than Number2");
		} else {
			return (long) Math.pow(num1, num2);
		}
	}

    public double squareRoot(int num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call sqrt method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("Number should not be negative or zero");
		} else {
			return Math.sqrt(num);
		}
	}
}
