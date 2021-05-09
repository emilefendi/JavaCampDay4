package adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import entities.Customer;
import javaCamp4thDay2ndExercise.abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(),
					customer.getLastName(),
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
