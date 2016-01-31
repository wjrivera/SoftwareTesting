package SoftwareTesting.AddressBook;

//testing

import java.util.ArrayList;

public class AddressBook {
	ArrayList<Person> entries;
	
	public AddressBook(){
		 entries= new ArrayList<Person>();
	}
	
	public void addEntry(Person person){
		
		entries.add(person);
	}
	public Person findEntry(String firstName, String lastName){
		for(int i=0;i<entries.size();i++){
			if(entries.get(i).getFirstName().matches(firstName)&&entries.get(i).getLastName().matches(lastName)){
				return entries.get(i);
			}
		}
		
		return null;
	}

}
