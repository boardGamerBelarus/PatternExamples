package com.epam.byta.patterns.decorator.workers;

public class TeamMember extends EmployeeDecorator {

	protected TeamMember(Employee employee) {
		super(employee);
	}

	public void performTask() {
		System.out.println(employee.getName() + " is performing his assigned tasks.");
	}

	public void coordinateWithOthers() {
		System.out.println(employee.getName() + " is coordinating with other members of his team.");
	}
}
