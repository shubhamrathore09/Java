package postException;

public class PostNotFoundException extends Exception{
	public PostNotFoundException() {
		
	}
	public PostNotFoundException(String msg) {
		super(msg);
	}
}