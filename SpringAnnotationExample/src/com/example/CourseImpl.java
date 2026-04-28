package com.example;

public class CourseImpl implements CourseInterface {

	@Override
	public void startCourse() {
		System.out.println("Course Started");

	}

	@Override
	public void endCourse() {
		System.out.println("Course Ended");

	}

}
