package com.epam.byta.patterns.decorator.workers;

public interface Employee {
	public void join(String joinDate);
	public void terminate(String terminateDate);
	public String getName();
}
