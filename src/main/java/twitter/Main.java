package twitter;

import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users users =new Users("C://Users//Mattia//eclipse-workspace//referendum//data//input//users.csv");
		System.out.println(users.set.values());
		//System.out.println(users.set.keySet());
		Collection<String> twitter_ids = users.set.values();
		
		

	}

}
