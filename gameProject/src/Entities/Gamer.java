package Entities;

import Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String nickName;
	
	private String nationalityId;
	
	private int birthofyear;

	public Gamer(int id, String firstName, String lastName, String nickName, String nationalityId,int birthofyear) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.nationalityId = nationalityId;
		this.birthofyear= birthofyear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getBirthofyear() {
		return birthofyear;
	}

	public void setBirthofyear(int birthofyear) {
		this.birthofyear = birthofyear;
	}
	
	
	
}
