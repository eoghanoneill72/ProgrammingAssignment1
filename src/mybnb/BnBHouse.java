package mybnb;

public class BnBHouse extends BnBProperty {
	 
	private int numStoreys;
	private int cleaningFee;
	
	public BnBHouse() {
		this(2,100);
	}

	public BnBHouse(int numStoreys, int cleaningFee) {
		super();
		this.numStoreys = numStoreys;
		this.cleaningFee = cleaningFee;
	}
	
	public BnBHouse(int regNum, String ownerName, String postalAddress, int dailyRate, int totalRentalDays, int numStoreys, int cleaningFee) {
		super(regNum, ownerName, postalAddress, dailyRate, totalRentalDays);
		this.numStoreys = numStoreys;
		this.cleaningFee = cleaningFee;
	}
	
	public int calculateIncome() {
		return super.getDailyRate()*super.getTotalRentalDays();
	}
	
	public void rent(int rentalDays) {
		setTotalRentalDays(getTotalRentalDays() + rentalDays);
	}
	
	public int getNumStoreys() {
		return numStoreys;
	}

	public void setNumStoreys(int numStoreys) {
		this.numStoreys = numStoreys;
	}

	public int getCleaningFee() {
		return cleaningFee;
	}

	public void setCleaningFee(int cleaningFee) {
		this.cleaningFee = cleaningFee;
	}

	@Override
	public String toString() {
		return super.toString() + "\nStoreys: " + numStoreys + "\nCleaning Fee: " + cleaningFee;
	}
}
