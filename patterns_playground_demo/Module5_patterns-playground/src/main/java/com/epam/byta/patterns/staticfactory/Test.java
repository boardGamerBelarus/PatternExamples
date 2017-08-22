package com.epam.byta.patterns.staticfactory;

public class Test {


	public static void main(String[] args) {
		User user = UserFactory.createSimpleUser();
		User user1 = UserFactory.createUserFromLastName("KapaNagendra");
		//...
		Integer.getInteger("123");		
	}

}
