package gameProject;

import Abstract.CampaignService;
import Abstract.GamerService;
import Adapters.MernisServiceAdapters;
import Concrete.CampaignMenager;
import Concrete.GamerMenager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class main {

	public static void main(String[] args) {
		
		

		GamerService gamerService= new GamerMenager(new MernisServiceAdapters());
		
		gamerService.register(new Gamer(1, "FÝLÝZ BÝRCE ", "ÇETÝN", "BÝRCE98 ", "63190268012", 1998));

		gamerService.informationUpdate(new Gamer(1, "FÝLÝZ BÝRCE", "ÇETÝN", "BÝRCE98 ", "63190268012", 1998));
		
		gamerService.deleteRecord(new Gamer(1, "FÝLÝZ BÝRCE", "ÇETÝN", "BÝRCE98", "63190268012", 1998));
		
		Game game= new Game(12334, "Tabu", 1000);
		
	
		
		CampaignService campaignService= new CampaignMenager();
		campaignService.addCampaign(new Campaign("yazýlýmcýlara özel", 15, game));
		campaignService.deleteCampaign(new Campaign("yazýlýmcýlara özel", 15, game));
        campaignService.updateCampaign(new Campaign("yazýlýmcýlara özel", 15, game));   
    System.out.println();    
	
	}
}
