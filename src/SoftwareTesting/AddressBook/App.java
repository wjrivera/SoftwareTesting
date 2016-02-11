package AddressBook;

import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        AddressBookController s=new AddressBookController();
        s.addEntry(new Person("Jason","Ricardo"));
        s.addEntry(new Person("Adam","Roberts"));
        s.addEntry(new Person("Adam","Anderson"));
        s.addEntry(new Person("Lidia","Verse"));
        s.addEntry(new Person("Ashley","Anderson"));
        s.addEntry(new Person("Rachel","Rechanek"));
        s.sortEntries();
        
        s.printOut();
        
        AddressBookController s2=new AddressBookController();
        s2.addEntry(new Person("Bob", "Saget", "1000 Maple Street", "San Francisco", "CA", "55555", "1234567890"));
        s2.addEntry(new Person("Jack", "Frost", "4000 Oak Lane", "Seatle", "WA", "12345", "0987654321"));
        
        try {
			s2.saveFile("TestFile");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
