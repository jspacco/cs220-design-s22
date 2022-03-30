package twitter;

public interface Follower {
	
	// in the observer pattern, this method is usually called "update"
	public void receiveTweet(Tweet tweet);

}
