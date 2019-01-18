/*
 * This class is quite useless at the moment
 */

package mylib;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class MyMethods {
	@SuppressWarnings("resource")
	static void readDataLineByLine(String file) {
		try { 
			  
	        // Create an object of filereader 
	        // class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(file); 
	  
	        // create csvReader object passing 
	        // file reader as a parameter 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	        String name, account, label;
	        
	        // we are going to read data line by line 
	        while ((nextRecord = csvReader.readNext()) != null) { 
	            name = nextRecord[0];
	            account = nextRecord[1];
	            label = nextRecord[2];
	            System.out.println(label);
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
		
	}
}
