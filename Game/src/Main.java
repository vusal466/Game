import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1,"Vusal","Jafarli",LocalDate.of(2001, 01, 8),"17899875");
		Game game = new Game(1,"Pubg",13,"war");
		Campaign campaign= new Campaign(1,"yaz sonu indirimi ",LocalDate.now(),LocalDate.of(2021, 9, 15),8,10);
		
		UserService userService = new UserManager(new VerificationServicesAdapter());
		userService.logOn(user);
		
		
		
		CampaignService campaignService=new CampaignManager();
		campaignService.add(campaign);
		
		
		
		GameService gameService = new GameManager();
		gameService.add(game);
		gameService.delete(game);
		
		
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.buy(user, game);
		
	}

}
