package SoftwareTesting.AddressBook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Testing push from Kyle" );
        AddressBookController s=new AddressBookController();
        s.addEntry(new Person("Jason","Ricardo"));
        s.addEntry(new Person("Adam","Roberts"));
        s.addEntry(new Person("Adam","Anderson"));
        s.addEntry(new Person("Lidia","Verse"));
        s.addEntry(new Person("Ashley","Anderson"));
        s.addEntry(new Person("Rachel","Rechanek"));
        s.sortEntries();
        
        s.printOut();
    }
}
