package twitter;

public class Tweet {
	private String message;
	private User sender;

	public Tweet(String message, User sender) {
		this.message = message;
		this.sender = sender;
	}
	
	public String toString() {
		return message;
	}
}
