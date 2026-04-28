package com.example;

public class InstituteImpl implements InstituteInterface {

	private CourseInterface course;
	private TrainerInterface trainer;

	public CourseInterface getCourse() {
		return course;
	}

	public void setCourse(CourseInterface course) {
		this.course = course;
	}

	public TrainerInterface getTrainer() {
		return trainer;
	}

	public void setTrainer(TrainerInterface trainer) {
		this.trainer = trainer;
	}

	@Override
	public void conductClass() {
		System.out.println("Institute Conducting Class");
		course.startCourse();
		trainer.teach();
	}
	@Override
	public void issueCertificate() {
		System.out.println("Certificate Issued");
		course.endCourse();
		trainer.giveAssignment();
	}

}
