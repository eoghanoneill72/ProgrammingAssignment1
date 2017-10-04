package mybnb;

public class BnBApartment extends BnBProperty {
	 
	private int storey;
	private int numBeds;
	
	public BnBApartment() {
		this(0,1);
	}

	public BnBApartment(int storey, int numBeds) {
		super();
		this.storey = storey;
		this.numBeds = numBeds;
	}
	
	public BnBApartment(int regNum, String ownerName, String postalAddress, int dailyRate, int totalRentalDays, int storey, int numBeds) {
		super(regNum, ownerName, postalAddress, dailyRate, totalRentalDays);
		this.storey = storey;
		this.numBeds = numBeds;
	}
	
	public int calculateIncome() {
		return super.getDailyRate()*super.getTotalRentalDays();
	}
	
	public void rent(int rentalDays) {
		setTotalRentalDays(getTotalRentalDays() + rentalDays);
	}

	public int getStorey() {
		return storey;
	}
	
	public int getNumbBeds( ) {
		return numBeds;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	public void setStorey(int storey) {
		this.storey = storey;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nStorey: " + storey + "\nNumber of Beds" + numBeds;
	}
}
