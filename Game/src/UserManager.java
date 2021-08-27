
public class UserManager implements UserService{

	UserCheckService checkService;
	
	public UserManager(UserCheckService checkService) {
		
		this.checkService = checkService;
	}
	
	
	@Override
	public void logIn(User user) {
		
	
		System.out.println("giris yapildi: "+user.getFirstName());
		
	}

	@Override
	public void logOn(User user) {
		if(checkService.checkIfRealPerson(user)) {
			System.out.println("kayit olundu: "+user.getFirstName());
		}else{
			System.out.println("bilgi yanlis girildi");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("kullanici bilgileri guncellendi: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("kullanici silindi: "+user.getFirstName());
		
	}

}
