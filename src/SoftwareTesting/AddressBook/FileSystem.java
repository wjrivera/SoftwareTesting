package AddressBook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSystem {

	//Unimplemented
	public AddressBookController createAddressBook(String title){
		AddressBookController ab=new AddressBookController();
		ab.setTitle(title);
		return ab;
	}
	
	public void loadAddressBook(String title){
		
	}
	public void updateAddressBook(){
		
	}

	public void saveAddressBook(AddressBookController ab){
 
		try {
			FileOutputStream fout = new FileOutputStream("c:\\"+ab.getTitle());
			ObjectOutputStream oos = new ObjectOutputStream(fout);  
			oos.writeObject(ab);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readFile(File file){}
	public void saveFile(AddressBookController addressBook, File file){}
	
}

