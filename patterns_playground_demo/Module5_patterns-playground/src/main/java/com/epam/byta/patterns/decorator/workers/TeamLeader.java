package com.epam.byta.patterns.decorator.workers;

public class TeamLeader extends EmployeeDecorator {

	protected TeamLeader(Employee employee) {
		super(employee);
	}

	public void planing() {
		System.out.println(this.employee.getName() + " is planing.");
	}

	public void motivate() {
		System.out.println(this.employee.getName() + " is motivating his members.");
	}
}
