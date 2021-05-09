package javaCamp4thDay2ndExercise.abstracts;

import entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
}
