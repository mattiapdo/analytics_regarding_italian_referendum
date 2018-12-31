package twitter;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Users{

	// Java code to illustrate reading a 
	// CSV file line by line and store into an HashMap
	public static HashMap<String, String> readData(String path) {
	    HashMap<String, String> result = new HashMap<String, String>();

	    try {
	        @SuppressWarnings("resource")
	        //CSVReader csvReader = new CSVReader(new FileReader(path));
	        CSVReader csvReader = new CSVReaderBuilder(new FileReader(path)).withSkipLines(1).build();
	        String[] line;

	        while ((line = csvReader.readNext()) != null) {
	            String name = line[0];
	            String twitter_id = line[1];
	            result.put(name, twitter_id);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	
	// set is the HashMap
	HashMap<String, String> set = null;
	
	// the constructor
	public Users(String path) {
		set = readData(path);
	}

}
	

