package twitter;

public class Main {

	public static void main(String[] args) {
		User u1 = new User("roger");
		User u2 = new User("clint");
		User u3 = new User("rachel");
		
		u1.follow(u2);
		u1.sendTweet("HELLO WORLD");
		u2.follow(u1);
		u1.follow(u3);
		u2.follow(u3);
		u3.sendTweet("hi there");
		u1.unfollow(u3);
		
		u3.sendTweet("u1 where did you go?");

	}

}
