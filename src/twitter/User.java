package twitter;

import java.util.HashSet;
import java.util.Set;

public class User implements Follower {
	
	private String username;
	private Set<Follower> followers = new HashSet<Follower>();
	
	public User(String username) {
		this.username = username;
	}

	@Override
	public void receiveTweet(Tweet tweet) {
		System.out.printf("%s receives %s\n", username, tweet);
	}
	
	public void sendTweet(Tweet tweet) {
		for (Follower f : followers) {
			// something this is called a "callback"
			f.receiveTweet(tweet);
		}
	}
	
	public void sendTweet(String message) {
		Tweet tweet = new Tweet(message, this);
		sendTweet(tweet);
	}
	
	public void follow(User other) {
		other.followers.add(this);
	}
	
	public void unfollow(User other) {
		other.followers.remove(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
	
}
