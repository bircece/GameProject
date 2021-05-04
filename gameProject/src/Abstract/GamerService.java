package Abstract;

import Entities.Gamer;

public interface GamerService {
	
	

	public void register(Gamer gamer);
	
	public void informationUpdate(Gamer gamer);
	
	public void deleteRecord(Gamer gamer);
	
}
