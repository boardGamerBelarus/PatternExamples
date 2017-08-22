package com.epam.byta.patterns.composite;

public class CompositeExample {

	public static void main(String[] args) {
		Worker worker1 = new Worker("Worker Tom", 5);
		Supervisor supervisor1 = new Supervisor("Supervisor Mary", 6);
		Supervisor supervisor2 = new Supervisor("Supervisor Jerry", 7);
		Supervisor supervisor3 = new Supervisor("Supervisor Bob", 9);
		Worker worker2 = new Worker("Worker Jimmy", 8);
		
		// set up the relationships
		supervisor1.AddSubordinate(worker1); // Tom works for Mary
		supervisor2.AddSubordinate(supervisor1); // Mary works for Jerry
		supervisor2.AddSubordinate(supervisor3); // Bob works for Jerry
		supervisor3.AddSubordinate(worker2); // Jimmy works for Bob

		// Jerry shows his happiness and asks everyone else to do the same		
		supervisor2.showHappiness();

	}

}
