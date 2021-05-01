package interfaces;



public class CustomerManager {
   
		
	
	
	private Logger[ ] logger ;
	
	
	public CustomerManager(Logger [] logger) {
		
		this.logger = logger;
	}

	public void add(Customer customer ) {
		
		System.out.println("Müþteri ekledi " + customer.getFistName());
		
		Utils.runLoggers(logger,customer.getFistName());
		
			
		
		
	}
	
	public void delete(Customer customer) {
		
		System.out.println("Müþteri silindi : "+ customer.getFirstName()) ;
		Utils.runLoggers(logger,customer.getFistName());
		
	}

}
