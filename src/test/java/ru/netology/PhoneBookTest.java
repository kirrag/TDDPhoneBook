package ru.netology;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


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
		assertNotNull("Контакт найден", findByNumberResult);
	}

	@Test
	public void testFindByName() {
		PhoneBook phoneBook = PhoneBook.getInstance();
		phoneBook.add("Ivan" , "+79251002032");
		String findByNameResult = phoneBook.findByName("Ivan");
		assertNotNull("Контакт найден", findByNameResult);
	}
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
    	System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void testPrintAllNames() {
		PhoneBook phoneBook = PhoneBook.getInstance();
		phoneBook.add("Ivan" , "+79251002032");
		phoneBook.add("Anna" , "+79251002031");
		phoneBook.add("Peter" , "+79251002033");

		phoneBook.printAllNames();

		assertEquals("[Anna, Ivan, Peter]", outputStreamCaptor.toString().trim());

	}
	
	@AfterEach
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
