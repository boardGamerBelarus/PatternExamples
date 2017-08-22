package com.epam.byta.patterns.staticfactory;

public class UserFactory {

	public static User createSimpleUser() {
		User user = new User();
		user.setFirstName("Alex");
		user.setLastName("Trush");
		user.setAge(18);

		return user;
	}

	public static User createUserFromBirthDate(int year) {
		User user = createSimpleUser();
		user.setAge(2013 - year);
		return user;
	}

	public static User createUserFromFirstName(String fName) {
		User user = createSimpleUser();
		user.setFirstName(fName);
		return user;
	}

	public static User createUserFromLastName(String lName) {
		User user = createSimpleUser();
		user.setLastName(lName);
		return user;
	}
}
