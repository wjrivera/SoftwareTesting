package SoftwareTesting;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import AddressBook.*;

public class AppTest {

	AddressBookController testBook;

	@Before
	public void setUp() throws Exception {
		testBook = new AddressBookController("TestAddressBook");
	}

	@After
	public void tearDown() throws Exception {
		testBook = null;
	}

	@Test
	public void testApp() {
		assertTrue(true);
	}

	@Test
	public void testPerson() {
		Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street",
				"San Francisco", "CA", "55555", "1234567890");
		assertEquals(bobPerson.getFirstName(), "Bob");
		assertEquals(bobPerson.getLastName(), "Saget");
	}

	@Test
	public void testPersonDetails() {
		Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street",
				"San Francisco", "CA", "55555", "1234567890");
		assertEquals(bobPerson.getAddress(), "1000 Maple Street");
		assertEquals(bobPerson.getCity(), "San Francisco");
		assertEquals(bobPerson.getState(), "CA");
		assertEquals(bobPerson.getZip(), "55555");
		assertEquals(bobPerson.getPhone(), "1234567890");

	}

	@Test
	public void testSaveFile() {
		testBook.addEntry(new Person("Bob", "Saget", "1000 Maple Street",
				"San Francisco", "CA", "55555", "1234567890"));
		testBook.addEntry(new Person("Jack", "Frost", "4000 Oak Lane", "Seatle",
				"WA", "12345", "0987654321"));

		try {
			assertTrue(testBook.saveFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetTitle() {
		assertEquals(testBook.getTitle(), "TestAddressBook");

	}
}
