package ru.netology;


public class PhoneBook {
	private static PhoneBook INSTANCE = null;


	private PhoneBook() {};

	public static PhoneBook getInstance() {
		if (INSTANCE == null) {
			synchronized (PhoneBook.class) {
				if (INSTANCE == null) {
					INSTANCE = new PhoneBook();
				}
			}
		}
		return INSTANCE;
	}

	public int add(String name, String phoneNumber)  {
		return 0;
	}
	

}
