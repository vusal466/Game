
public class VerificationServicesAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		System.out.println("kullanici dogrulandi: " +user.getFirstName());
		return true;
	}

}
