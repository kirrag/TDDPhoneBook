package ru.netology;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {
	private static PhoneBook INSTANCE = null;

	private Map<String, String> contactsByName = new TreeMap<>();
	private Map<String, String> contactsByPhoneNumber = new HashMap<>();

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
		contactsByName.put(name, phoneNumber);
		contactsByPhoneNumber.put(phoneNumber, name);
		return 1;
	}

	public String findByNumber(String phoneNumber) {
		return contactsByPhoneNumber.get(phoneNumber);
	}

	public String findByName(String name) {
		return null;
	}
	
}
