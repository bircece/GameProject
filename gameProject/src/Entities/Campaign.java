package Entities;

import Abstract.Entity;

public class Campaign implements Entity{

	private String campaignName;
	
	private int discountRate;//indirim oraný
	
	private Game game;
	
	private int  discountPrice;
	
	public Campaign(String campaignName, int discountRate, Game game) {
		
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.game = game;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public int getDiscountPrice() {
		return this.game.getPrice() - (this.game.getPrice()* (this.discountRate / 100));
	}




	
	
}

