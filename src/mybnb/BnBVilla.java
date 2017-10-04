package mybnb;

public class BnBVilla extends BnBProperty{

	private int numRooms;
	private int roomService;
	private int taxRate;
	
	public BnBVilla() {
		this(10,100,10);
	}

	public BnBVilla(int numRooms, int roomService, int taxRate) {
		super();
		this.numRooms = numRooms;
		this.roomService = roomService;
		this.taxRate = taxRate;

	}
	
	public BnBVilla(int regNum, String ownerName, String postalAddress, int dailyRate, int totalRentalDays, int numRooms, int roomService, int taxRate) {
		super(regNum, ownerName, postalAddress, dailyRate, totalRentalDays);
		this.numRooms = numRooms;
		this.roomService = roomService;
		this.taxRate = taxRate;
	}
	
	public int calculateIncome() {
		//assume room service availed of everyday
		int costOfRoomService = roomService*super.getTotalRentalDays();
		return (super.getDailyRate()*super.getTotalRentalDays()+taxRate+costOfRoomService);
	}
	
	public void rent(int rentalDays) {
		setTotalRentalDays(getTotalRentalDays() + rentalDays);
	}
	
	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public int getRoomService() {
		return roomService;
	}

	public void setRoomService(int roomService) {
		this.roomService = roomService;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRooms: " + numRooms + "\nRoom Service Rate" + roomService + "\nLuxury Tax Rate" + taxRate;
	}

}
