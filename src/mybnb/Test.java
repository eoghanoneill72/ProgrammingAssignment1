package mybnb;

public class Test {
	public static void main(String[] args) {	
		// Create 9 Property Objects
		
		BnBApartment apartment1 = new BnBApartment(1,"Aaron","Aaron Lane",1,1,1,1);
		BnBApartment apartment2 = new BnBApartment(2,"Breda","Bredaburg",2,2,2,2);
		BnBApartment apartment3 = new BnBApartment(3,"Catlin","Catlingrad",3,3,3,3);

		BnBHouse house1 = new BnBHouse();
		BnBHouse house2 = new BnBHouse();
		BnBHouse house3 = new BnBHouse();
		
		BnBVilla villa1 = new BnBVilla();
		BnBVilla villa2 = new BnBVilla();
		BnBVilla villa3 = new BnBVilla();
		
		// Create array of properties to work from

		BnBProperty [] propertiesArray = {apartment1, apartment2, apartment3,
				house1, house2, house3, villa1, villa2, villa3};
		
		fillInProperties(propertiesArray);
		
		printAllProperties();
		
		System.out.println(calculateTotalIncome());
		}
	

	
	public static void fillInProperties(BnBProperty [] propertiesArray){
		
		for(BnBProperty property: propertiesArray) {
			if(property instanceof BnBApartment) {
				property.rent();
				property.rent();
				property.rent();
				BnBProperty.apartmentList.add((BnBApartment) property);
			}else if(property instanceof BnBVilla) {
				property.rent();
				property.rent();
				property.rent();
				BnBProperty.villaList.add((BnBVilla) property);
			}else if(property instanceof BnBHouse){
				property.rent();
				property.rent();
				property.rent();
				BnBProperty.houseList.add((BnBHouse) property);
			}else{
				System.out.println("could not rent property");
			}
		}
		}
		
		public static void printAllProperties(){
			
			for(BnBHouse house: BnBProperty.houseList) {
				System.out.println(house+"\n");
			}
			
			for(BnBApartment apartment: BnBProperty.apartmentList) {
				System.out.println(apartment+"\n");
			}
			
			for(BnBVilla villa: BnBProperty.villaList) {
				System.out.println(villa+"\n");
			}
		}
			
		public static int calculateTotalIncome(){
			int totalIncome = 0;
			
			for(BnBHouse house: BnBProperty.houseList) {
				totalIncome += house.calculateIncome();
			}
			
			for(BnBApartment apartment: BnBProperty.apartmentList) {
				totalIncome += apartment.calculateIncome();
			}
			
			for(BnBVilla villa: BnBProperty.villaList) {
				totalIncome += villa.calculateIncome();
			}
			
			return totalIncome;
	}

}
