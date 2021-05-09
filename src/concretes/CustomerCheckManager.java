package concretes;

import entities.Customer;
import javaCamp4thDay2ndExercise.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		return true;
	}

}
