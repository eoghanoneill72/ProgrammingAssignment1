package mybnb;

import java.util.ArrayList;

public abstract class BnBProperty {
	//Array Lists to fill
	public static ArrayList<BnBApartment> apartmentList = new ArrayList<BnBApartment>();
	public static ArrayList<BnBHouse> houseList = new ArrayList<BnBHouse>();
	public static ArrayList<BnBVilla> villaList = new ArrayList<BnBVilla>();
	
	
	private int regNum;
	private String ownerName;
	private String postalAddress;
	private int dailyRate;
	private int totalRentalDays;
	
	protected BnBProperty() {
		this(0,"","",0,0);
	}
		
	protected BnBProperty(int regNum, String ownerName, String postalAddress, int dailyRate, int totalRentalDays) {
		this.regNum = regNum;
		this.ownerName = ownerName;
		this.postalAddress = postalAddress;
		this.dailyRate = dailyRate;
		this.totalRentalDays = totalRentalDays;
	}
	
	public abstract int calculateIncome();

	public int getRegNum() {
		return regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public int getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getTotalRentalDays() {
		return totalRentalDays;
	}

	public void setTotalRentalDays(int totalRentalDays) {
		this.totalRentalDays = totalRentalDays;
	}
	
	@Override
	public String toString() {
		return "Registration Number: "+ regNum + "\nOwner Name: " + ownerName + 
				"\nPostal Address: " + postalAddress + "\nDaily Rate: " + dailyRate +
				"\nTotal Rental: " + totalRentalDays;
	}

	public void rent() {
		totalRentalDays++;
		
	}
}
