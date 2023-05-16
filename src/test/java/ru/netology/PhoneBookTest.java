package ru.netology;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class PhoneBookTest {

	@Test
	public void testAddition() {
		PhoneBook phoneBook = PhoneBook.getInstance();
		int addResult = phoneBook.add("Ivan" , "+79251002032");
		int unexpectedResult = 0;
		assertNotEquals("Контакт добавлен", unexpectedResult, addResult);
	}

	@Test
	public void testFindByNumber() {
		PhoneBook phoneBook = PhoneBook.getInstance();
		phoneBook.add("Ivan" , "+79251002032");
		String findByNumberResult = phoneBook.findByNumber("+79251002032");
		assertNotNull("Котакт найден", findByNumberResult);
	}
	
}
