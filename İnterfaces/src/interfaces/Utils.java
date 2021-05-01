package interfaces;



public class Utils {
	
	public static void runLoggers (Logger[] logger,String message ) {
		
		for( Logger loger : logger) {
			loger.log(message);
			
		
		}
	
	}
}