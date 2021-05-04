package Concrete;

import Abstract.SalesGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesGameMenager implements SalesGameService {

	@Override
	public void gameBuy(Gamer gamer, Game game) {
		System.out.println(gamer.getNickName()+ " adl� oyuncu "+ game.getName()+ "oyununu sat�n ald�..");
		
	}

	@Override
	public void Campaignbuy(Gamer gamer, Campaign campaign,Game game) {
		System.out.println(gamer.getNickName()+" adl� oyuncu "+game.getName()+ "oyununu kampanyal� olarak "+ 
	                  campaign.getDiscountPrice()+" tl ye sat�n ald�..");
		
	}

}
