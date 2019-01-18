package twitter;

public class User {
	String name;
	String twitter_id ;
	String label;
	
	public User() {
		this.name = "";
		this.twitter_id = "";
		this.label = "";
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setTwitterId(String newTwitterId) {
		this.twitter_id = newTwitterId;
	}
	
	public void setLabel(String newLabel) {
		this.label = newLabel;
	}
}
