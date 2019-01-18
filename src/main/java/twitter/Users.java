package twitter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import com.opencsv.CSVReader;

public class Users{
	
	// attribute
	private static ArrayList<User> list = new ArrayList<User>();
	
	// constructor
	@SuppressWarnings("resource")
	public Users(String path) {
	    
	    try {
	    	// Create an object of file reader class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(path); 
	  
	        // create csvReader object passing file reader as a parameter 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	        
	        // we are going to read data line by line 
	        while ((nextRecord = csvReader.readNext()) != null) {
	        	User user = new User();
	        	user.setName(nextRecord[0]);
	            user.setTwitterId(nextRecord[1]);
	            user.setLabel(nextRecord[2]);
	            System.out.println(user.name + " " + user.twitter_id + " " + user.label);
	            this.list.add(user);
	        } 
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	// this method prints the users stored in the list
	public static void print() {
		for (User user : list) {
			System.out.println(user.name + ",  " + user.twitter_id + ",  " + user.label);
		}
	}
	
}
	

