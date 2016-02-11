package SoftwareTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import AddressBook.Person;

public class AppTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
    public void testApp()
    {
        assertTrue( true );
    }
    @Test
	public void testPerson(){
    	Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street", "San Francisco", "CA", "55555", "1234567890");
    	assertEquals(bobPerson.getFirstName(), "Bob");
    	assertEquals(bobPerson.getLastName(), "Saget");
   }
    @Test
    public void testPersonDetails(){
    	Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street", "San Francisco", "CA", "55555", "1234567890");
    	assertEquals(bobPerson.getAddress(), "1000 Maple Street");
    	assertEquals(bobPerson.getCity(), "San Francisco");
    	assertEquals(bobPerson.getState(), "CA");
    	assertEquals(bobPerson.getZip(), "55555");
    	assertEquals(bobPerson.getPhone(), "1234567890");

    }
    
    @Test
    public void testSaveFile(){
    	
    }
}
