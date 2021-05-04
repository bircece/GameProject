package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesGameService {

	public void gameBuy(Gamer gamer, Game game);
	
	public void Campaignbuy(Gamer gamer, Campaign campaign, Game game);
}
