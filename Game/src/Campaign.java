import java.time.LocalDate;

public class Campaign {
	
	private int id;
	private String campaignName;
	private LocalDate startDate;
	private LocalDate lastDate;
	private int percent;
	private int price;
	
public Campaign(){
		
	}

	public Campaign(int id,String campaignName, LocalDate startDate, LocalDate lastDate, int price, int percent) {
		this.id=id;
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.price = price;
		this.percent=percent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getPriceAfterDiscount() {
		return price-(price*percent/100);
	}
}
