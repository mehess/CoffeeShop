package coffee.shop;

/**
 * The Customer
 * @author Madison
 */
public class Customer {
	
	/* The maximum length of a customers name is 25 since you shouldn't be forced to wrap more than that around a cup */
	private static int MAX_NAME_LENGTH = 25;
	
	/* The name of the Customer */
	public String name;
	
	/**
	 * The constructor for the Customer class
	 */
	public Customer(String name) {
		
		if( name.length() <= MAX_NAME_LENGTH ) {
			this.name = name;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
