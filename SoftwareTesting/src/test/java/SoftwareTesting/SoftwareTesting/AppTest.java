package SoftwareTesting.SoftwareTesting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	
	public void testPerson(){
    	Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street", "San Francisco", "CA", "55555", "1234567890");
    	assertEquals(bobPerson.getFirstName(), "Bob");
    	assertEquals(bobPerson.getLastName(), "Saget");
   }
    public void testPersonDetails(){
    	Person bobPerson = new Person("Bob", "Saget", "1000 Maple Street", "San Francisco", "CA", "55555", "1234567890");
    	assertEquals(bobPerson.getAddress(), "1000 Maple Street");
    	assertEquals(bobPerson.getCity(), "San Francisco");
    	assertEquals(bobPerson.getState(), "CA");
    	assertEquals(bobPerson.getZip(), "55555");
    	assertEquals(bobPerson.getPhone(), "1234567890");

    }
}
