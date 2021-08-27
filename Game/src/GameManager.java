
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getType()+" turunde, "+game.getGameName()+" adli oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" adli oyunun ucreti guncellendi: "+game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getType()+" kategorisinden "+game.getGameName()+" adli oyun silindi.");
		
	}

}
