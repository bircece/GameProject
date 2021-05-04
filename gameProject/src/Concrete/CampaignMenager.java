package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignMenager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getCampaignName()+" kampanyasý eklendi");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {

		System.out.println(campaign.getCampaignName()+ " kampanyasý silindi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {


		System.out.println(campaign.getCampaignName()+" kampanyasý güncellendi.");
	}

	

}
