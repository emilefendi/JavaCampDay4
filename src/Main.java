import java.util.GregorianCalendar;

import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Emil");
		customer.setLastName("Efendi");
		customer.setDateOfBirth(new GregorianCalendar(2002,04,10).getTime());
		customer.setNationalityId("1234567891");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
		
	}

}
