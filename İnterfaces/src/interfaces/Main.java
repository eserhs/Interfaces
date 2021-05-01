package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DataBaseLogger() , new SmsLogger(),new FileLogger()};
	CustomerManager customerManager1  = new CustomerManager(loggers);

	Customer eserCustomer1 = new Customer(1,"eser ","olgun");
	
	customerManager1.add(eserCustomer1);
	
	
	
	
	
	
	}
	



	
	
	

}
