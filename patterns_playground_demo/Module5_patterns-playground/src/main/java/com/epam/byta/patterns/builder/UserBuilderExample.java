package com.epam.byta.patterns.builder;

public class UserBuilderExample {

	public static void main(String[] args) {
		User testUser = new User.UserBuilder("John", "Doe")
				.age(30)
				.phone("+375297777777")
				.address("NewTown 220000")
				.build();
		System.out.println(testUser.toString());
	}

}
