package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerMenager implements GamerService{

	
	private GamerCheckService gamerCheckService;
	
	
	
	public GamerMenager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) {

		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+ "adl� kullan�c� sisteme kay�t edildi.");
		}
		else {
			System.out.println("hatal� bilgi girildi");
		}
	}

	@Override
	public void informationUpdate(Gamer gamer) {
		
		System.out.println(gamer.getNickName()+" bilgileri g�ncellendi");
		
	}

	@Override
	public void deleteRecord(Gamer gamer) {
        
		System.out.println(gamer.getNickName()+ " silindi");		
	}

}
