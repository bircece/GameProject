package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapters implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoap mernisValidation= new KPSPublicSoapProxy();
		
		
			try {
				if (mernisValidation.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(),gamer.getLastName(),
						gamer.getBirthofyear())) {
					return true;
					
				}
				
else {
					return false;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	           return false;
		
	

	

}}
