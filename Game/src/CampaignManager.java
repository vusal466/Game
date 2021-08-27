
public class CampaignManager implements CampaignService {

	Game game;
	@Override
	public void add(Campaign campaign) {
		
		
		System.out.println(" kampanya eklendi: "+campaign.getCampaignName() +"fiyat: "+campaign.getPriceAfterDiscount()+" dolar");
		System.out.println("NOT: bu kampanya "+campaign.getStartDate()+"  -  "+campaign.getLastDate()+" tarihleri arasinda gecerlidir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya guncellendi: "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi: "+campaign.getCampaignName());
		
	}

}
