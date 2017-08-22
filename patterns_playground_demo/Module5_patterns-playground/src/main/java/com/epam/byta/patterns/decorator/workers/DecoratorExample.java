package com.epam.byta.patterns.decorator.workers;

public class DecoratorExample {

	public static void main(String[] args) {
		// create new employee
		Employee employee = new EmployeeImpl("John Doe");
		employee.join("2013");

		// assign team member functionality
		employee = new TeamMember(employee);
		((TeamMember) employee).coordinateWithOthers();

		// assign team leader functionality
		employee = new TeamLeader(employee);
		((TeamLeader) employee).motivate();

		// assign manager functionality
		employee = new Manager(employee);
		((Manager) employee).assignTask();
		((Manager) employee).createRequirments();
		
		employee.terminate("2015");
	}

}
