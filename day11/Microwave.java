package com.celcom.day11;

import java.util.Scanner;

class Heating {
	private int noOfItems;
	private double seconds;
	private String food;
	private String microwaveModel;

	Heating(int noOfItems, double seconds, String food, String microwaveModel) {
		this.noOfItems = noOfItems;
		this.seconds = seconds;
		this.food = food;
		this.microwaveModel = microwaveModel;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public double getSeconds() {
		return seconds;
	}

	public String getFood() {
		return food;
	}

	public String getMicrowaveModel() {
		return microwaveModel;
	}
}

public class Microwave {
	public static double noOfItems(int num, double seconds) {
		if (num == 1) {
			return seconds;
		} else if (num == 2) {
			return seconds * 1.5;
		} else {
			return seconds * 2.0;
		}
	}

	public static double foodValue(String food, double val) {
		if (food.equals("pasta")) {
			return val + val * 0.1;
		} else if (food.equals("frozen-meal")) {
			return val + val * 0.2;
		} else {
			return val;
		}
	}

	public static double power(String model, double value) {
		if (model.equals("high")) {
			return value;
		} else if (model.equals("medium")) {
			return value - value * 0.1;
		} else {
			return value + value * 0.15;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of items (1 to 3 items):");
		int num = sc.nextInt();
		if (num < 1 || num > 3) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		System.out.println("Enter the heating time for one item (in seconds):");
		double seconds = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter the type of food (e.g., pasta, frozen-meal, vegetables):");
		String food = sc.next().toLowerCase();
		if (!food.equals("pasta") && !food.equals("frozen-meal") && !food.equals("vegetables")) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		System.out.println("Enter the microwave model (high, medium, low):");
		String model = sc.next().toLowerCase();
		if (!model.equals("high") && !model.equals("medium") && !model.equals("low")) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		Heating heat = new Heating(num, seconds, food, model);
		double value = noOfItems(heat.getNoOfItems(), heat.getSeconds());
		double val = foodValue(heat.getFood(), value);
		double result = power(heat.getMicrowaveModel(), val);
		System.out.println("The recommended heating time is: " + result);
	}
}
