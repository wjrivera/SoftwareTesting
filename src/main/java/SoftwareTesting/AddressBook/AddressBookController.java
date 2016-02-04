package SoftwareTesting.AddressBook;

import java.util.ArrayList;

public class AddressBookController {
	ArrayList<Person> entries;
	
	public AddressBookController(){
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

	public void editPerson(){}
	public void deletePerson(){}
	
	public void sortEntries(){}
	public void createAddressBook(){}
	public void updateAddressBook(){}
	public void saveAddressBook(){}
	public void save(){}

}
