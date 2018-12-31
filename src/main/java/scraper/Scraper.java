
package scraper;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {
	
	public static String[] getLetters(String fromUrl) throws IOException {
		
      Document document = Jsoup.connect(fromUrl).get();
      document = Jsoup.parse(document.toString());
      Elements divs = document.select("div.divNavOrizS");
      
      String[] letters_array = null;
      String letters = null;
      
      for (Element div : divs) {
    	  letters = div.text().toLowerCase();
    	  letters_array = letters.split(" ");
      }
      
      
      // build urls
      for(int i = 0; i<letters_array.length; i++) {
    	  letters_array[i] = "http://www.senato.it/leg/17/BGT/Schede/Attsen/Sen" + letters_array[i] + ".html";  
      }
      
      return letters_array;
	      
	}
	
	public static ArrayList<String> getLinks(String letterUrl) throws IOException {
		String url = "http://www.senato.it/leg/17/BGT/Schede/Attsen/Sena.html"; 
	      
		Document document = Jsoup.connect(url).get();
	    document = Jsoup.parse(document.toString());
	    Elements divs = document.select("div.linkSenatore");
	    
	    ArrayList<String> links_array = new ArrayList<String>();
	      
	    for (Element div : divs) {
	    	String person_link = "http://www.senato.it" + div.select("a").first().attr("href");
	    	links_array.add(person_link);
	    }
	    
	    return links_array;
	}
	
}  
