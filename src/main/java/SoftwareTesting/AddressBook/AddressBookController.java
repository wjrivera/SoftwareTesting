package SoftwareTesting.AddressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBookController{
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

	public void editPerson(Person originalPerson, Person updatedPerson){
		if(entries.contains(originalPerson)){
			entries.remove(originalPerson);
			entries.add(updatedPerson);
		}else{
			System.out.println("Person did not exist we will create it for you");
			entries.add(updatedPerson);
		}
		
	}
	public boolean deletePerson(Person person){
		if(entries.contains(person)){
			entries.remove(person);
			return true;
		}
		
		return false;
		
		
	}
	
	public void sortEntries(){
		Collections.sort(entries, new Comparator<Person>(){
		    public int compare(Person person1, Person person2) {
		        return person1.getLastName().compareToIgnoreCase(person2.getLastName());
		        		
		    }
		});

	}
	
	public void printOut(){
		for(int i=0; i<entries.size();i++){
			Person p=entries.get(i);
			System.out.println("First Name: "+p.getFirstName());
			System.out.println("Last Name: "+p.getLastName());
			System.out.println(" ");
			System.out.println(" ");
		}
		
		
	}
	
	//Unimplemented
	public void createAddressBook(){}
	public void loadAddressBook(){}
	public void updateAddressBook(){}
	public void saveAddressBook(){}



}
