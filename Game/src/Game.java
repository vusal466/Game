
public class Game {
	private int id;
	private String gameName;
	private int price;
	private String type;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, int price, String type) {
		
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.type=type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
