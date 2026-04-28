package com.example;

public class TrainerImpl implements TrainerInterface {

	@Override
	public void teach() {
		 System.out.println("Trainer Teaching");

	}

	@Override
	public void giveAssignment() {
		System.out.println("Assignment Given");

	}

}
