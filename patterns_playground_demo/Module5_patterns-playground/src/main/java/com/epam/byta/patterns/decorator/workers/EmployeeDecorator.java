package com.epam.byta.patterns.decorator.workers;

public abstract class EmployeeDecorator implements Employee {

	protected Employee employee;

	protected EmployeeDecorator(Employee employee) {
		this.employee = employee;
	}

	public void join(String joinDate) {
		employee.join(joinDate);
	}

	public void terminate(String terminateDate) {
		employee.terminate(terminateDate);
	}

	public String getName() {
		return employee.getName();
	}

}
