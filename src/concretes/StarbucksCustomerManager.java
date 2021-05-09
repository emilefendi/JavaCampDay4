package concretes;

import entities.Customer;
import javaCamp4thDay2ndExercise.abstracts.BaseCustomerManager;
import javaCamp4thDay2ndExercise.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			save(customer);
		}else {
			System.out.println("Wrong information");
		}
	}
}
