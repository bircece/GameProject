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
			System.out.println(gamer.getFirstName()+ "adlý kullanýcý sisteme kayýt edildi.");
		}
		else {
			System.out.println("hatalý bilgi girildi");
		}
	}

	@Override
	public void informationUpdate(Gamer gamer) {
		
		System.out.println(gamer.getNickName()+" bilgileri güncellendi");
		
	}

	@Override
	public void deleteRecord(Gamer gamer) {
        
		System.out.println(gamer.getNickName()+ " silindi");		
	}

}
