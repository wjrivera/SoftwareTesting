package AddressBook;

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
    }
}
