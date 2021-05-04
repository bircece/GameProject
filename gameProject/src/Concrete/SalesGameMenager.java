package Concrete;

import Abstract.SalesGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesGameMenager implements SalesGameService {

	@Override
	public void gameBuy(Gamer gamer, Game game) {
		System.out.println(gamer.getNickName()+ " adlý oyuncu "+ game.getName()+ "oyununu satýn aldý..");
		
	}

	@Override
	public void Campaignbuy(Gamer gamer, Campaign campaign,Game game) {
		System.out.println(gamer.getNickName()+" adlý oyuncu "+game.getName()+ "oyununu kampanyalý olarak "+ 
	                  campaign.getDiscountPrice()+" tl ye satýn aldý..");
		
	}

}
