package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.err.println("Email g�derildi :" + message);
		
	}
	
	

}
