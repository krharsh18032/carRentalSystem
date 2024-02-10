package  carRentalSystem;
import carRentalSystem.Customer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Calendar;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;
import java.time.format.DateTimeParseException;
//import java.util.Time;
import java.util.HashMap;
import java.util.Scanner;
class Car{
	Scanner input=new Scanner(System.in);
	String brandChoice,modelChoice;
    //String rupee = "\u20B9";
	
	protected void carBrand(){
	ArrayList <String> carBrand=new ArrayList<String>();
	carBrand.add("HYUNDAI");
	carBrand.add("TATA");
	carBrand.add("TOYOTA");
	carBrand.add("MAHINDRA");
	carBrand.add("MARUTI SUZUKI");

	System.out.println("Which brand are you looking for:\n\n");
	for(int i=0;i<carBrand.size();i++){
	System.out.print(carBrand.get(i)+"                      ");
	}
	System.out.print("\n\nEnter Brand Name:");
	String brandChoice=input.nextLine();
	switch(brandChoice.toUpperCase()){
		case "HYUNDAI":
		  this.brandChoice=brandChoice;
		  break;
		case "TATA":
		  this.brandChoice=brandChoice;
		  break;
		case "TOYOTA":
		  this.brandChoice=brandChoice;
		  break;
		case "MAHINDRA":
		  this.brandChoice=brandChoice;
		  break;
		case "MARUTI SUZUKI":
		  this.brandChoice=brandChoice;
		  break;
	}
}
    protected void carModel(){
     Map <String,Integer> hyundaiModels=new HashMap<>();
	hyundaiModels.put("Hyundai Creta",3000);
	hyundaiModels.put("Hyundai Venue",2800);
	hyundaiModels.put("Hyundai Exter",3500);
	hyundaiModels.put("Hyundai Grand i10 Nios",2500);
	hyundaiModels.put("Hyundai i20",2600);
	hyundaiModels.put("Hyundai Verna",3200);

	ArrayList <String> hyundaiKeys=new ArrayList<>(hyundaiModels.keySet());
	ArrayList <Integer> hyundaiValues=new ArrayList<>(hyundaiModels.values());

    Map <String,Integer> tataModels=new HashMap<>();
	tataModels.put("Tata Altroz",2700);
	tataModels.put("Tata Nexon",2900);
	tataModels.put("Tata Harrier",3300);
	tataModels.put("Tata Tiago",2400);
	tataModels.put("Tata Safari",3400);
	tataModels.put("Tata Tigor",2500);

	ArrayList <String> tataKeys=new ArrayList<>(tataModels.keySet());
	ArrayList <Integer> tataValues=new ArrayList<>(tataModels.values());

    Map <String,Integer> toyotaModels=new HashMap<>();
	toyotaModels.put("Toyota Land Cruiser",5000);
	toyotaModels.put("Toyota Fortuner",6000);
    toyotaModels.put("Toyota Hilux",4000);
	toyotaModels.put("Toyota Camry",3800);
	toyotaModels.put("Toyota Highlander",4200);
	toyotaModels.put("Toyota Tacoma",4000);

	ArrayList <String> toyotaKeys=new ArrayList<>(toyotaModels.keySet());
	ArrayList <Integer> toyotaValues=new ArrayList<>(toyotaModels.values());

	Map <String,Integer> mahindraModels=new HashMap<>();
	mahindraModels.put("Mahindra XUV300",3100);
	mahindraModels.put("Mahindra Scorpio",3300);
	mahindraModels.put("Mahindra Thar",4000);
	mahindraModels.put("Mahindra XUV700 ",4100);
	mahindraModels.put("Mahindra Bolero",3000);
	mahindraModels.put("Mahindra TUV300",3100);

	ArrayList <String> mahindraKeys=new ArrayList<>(mahindraModels.keySet());
	ArrayList <Integer> mahindraValues=new ArrayList<>(mahindraModels.values());

	Map <String,Integer> suzukiModels=new HashMap<>();
	suzukiModels.put("Maruti Suzuki Alto 800",2000);
	suzukiModels.put("Maruti Suzuki Ertiga",2800);
	suzukiModels.put("Maruti Suzuki Alto K10",2100);
	suzukiModels.put("Maruti Suzuki Wagon R",2200);
	suzukiModels.put("Maruti Suzuki Swift",2500);
	suzukiModels.put("Maruti Suzuki Baleno",2400);

	ArrayList <String> suzukiKeys=new ArrayList<>(suzukiModels.keySet());
	ArrayList <Integer> suzukiValues=new ArrayList<>(suzukiModels.values());

	String model=brandChoice;
	System.out.println("Choose your car model:\n");
	switch(model.toUpperCase()){
		case "HYUNDAI":
		System.out.println(String.format("%-30s %s %-10s", "Car Model", "|", "Price"));
        System.out.println("---------------------------------------------------");
		System.out.println();
		  for(int i=0;i<hyundaiKeys.size();i++){
		    System.out.println(String.format("%-30s %s %d %s", hyundaiKeys.get(i).toUpperCase(), "|", hyundaiValues.get(i),"RS. PER DAY"));
			if(i==(hyundaiKeys.size()-1)){
				System.out.println();
				modelChoice=input.nextLine();
			    this.modelChoice=modelChoice;
			}  }
			break;
		case "TATA":
		  System.out.println(String.format("%-30s %s %-10s", "Car Model", "|", "Price"));
          System.out.println("---------------------------------------------------");
		  for(int i=0;i<tataKeys.size();i++){
		    System.out.println(String.format("%-30s %s %d %s", tataKeys.get(i).toUpperCase(), "|", tataValues.get(i),"RS. PER DAY"));
			if(i==(tataKeys.size()-1)){
				System.out.println();
				modelChoice=input.nextLine();
			    this.modelChoice=modelChoice;
			} }
			break;
		case "TOYOTA":
		  System.out.println(String.format("%-30s %s %-10s", "Car Model", "|", "Price"));
          System.out.println("---------------------------------------------------");
		  for(int i=0;i<toyotaKeys.size();i++){
		    System.out.println(String.format("%-30s %s %d %s", toyotaKeys.get(i).toUpperCase(), "|", toyotaValues.get(i)," RS. PER DAY"));
			if(i==(toyotaKeys.size()-1)){
				System.out.println();
				modelChoice=input.nextLine();
			    this.modelChoice=modelChoice;
			}  }
			break;
		case "MAHINDRA":
		  
          System.out.println("---------------------------------------------------");
		  for(int i=0;i<mahindraKeys.size();i++){
		    System.out.println(String.format("%-30s %s %d %s", mahindraKeys.get(i).toUpperCase(), "|", mahindraValues.get(i)," RS.PER DAY"));
			if(i==(mahindraKeys.size()-1)){
				System.out.println();
				modelChoice=input.nextLine();
			    this.modelChoice=modelChoice;
			} }
			break;
		case "MARUTI SUZUKI":
		  System.out.println(String.format("%-30s %s %-10s", "Car Model", "|", "Price"));
          System.out.println("---------------------------------------------------");
		  for(int i=0;i<suzukiKeys.size();i++){
		    System.out.println(String.format("%-30s %s %d %s", suzukiKeys.get(i).toUpperCase(), "|", suzukiValues.get(i)," RS. PER DAY"));
			if(i==(suzukiKeys.size()-1)){
				System.out.println();
				modelChoice=input.nextLine();
			    this.modelChoice=modelChoice;
			} }
			break;
	}
}
    protected void reservation() throws DateTimeParseException {
		System.out.println("You have selected :"+modelChoice.toUpperCase());
		System.out.println("""
        1. Agreement: You need to agree to the rental company's terms, conditions, and pricing.
        2. Reservation: You can reserve a car by providing details like the car type, rental start date and time, rental location, rental period, return location, driver's name, and any special requests.
        3. Availability: The rental company will try to provide the car you reserved, but it depends on their car availability.
        4. Deposit: You might need to pay a deposit when you make a reservation.
        5. Changes: If you want to change your reservation details, you need to get the rental company's approval.
        6. Cancellation: You can cancel your reservation with the rental company's approval. If you don't show up within an hour of the rental start time, your reservation might be cancelled.
        7. Usage: You need to agree with the rental company on what you'll use the car for. The rental agreement should state that the car is not for illegal activities or sub-leasing.
        """);
		
		System.out.println("Do you agree to above terms and conditions ?\nYES or NO");
		String agree=input.nextLine();
		if(agree.equalsIgnoreCase("YES")){
			System.out.println("\n--------------------------------------------------RESERVATION DETAILS---------------------------------------");
			
			try{
			System.out.println("Enter the rental start date (DD/MM/YYYY):");
			String startDate=input. nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date rentalStartDate = dateFormat.parse(startDate);
			
			System.out.println("Enter the rental period in days:");
			int period=input. nextInt();
			Calendar calendar = Calendar.getInstance();
            calendar.setTime(rentalStartDate);
            calendar.add(Calendar.DAY_OF_MONTH,period);

            Date rentalExpiryDate = calendar.getTime();
			String endDate=dateFormat.format(rentalExpiryDate);
			System.out.println("Rental expiry date: " + endDate);
			}
			catch(ParseException e){
				System.out.println("Invalid date format");
			}
			
			
			
			System.out.println("Enter the rental location:");
			String location=input. nextLine();
		}
		if(agree.equalsIgnoreCase("NO")){
			System.exit(0);
		}
	}

	protected void carId(){
	ArrayList <String> carId=new ArrayList<String>();
	carId.add("HYNCRET");
	carId.add("HYNVEN");
	carId.add("HYNEXT");
	carId.add("HYNI10");
	carId.add("HYNI20");
	carId.add("HYNVER");

    carId.add("TATALT");
	carId.add("TATNEX");
	carId.add("TATHAR");
	carId.add("TATTIA");
	carId.add("TATSAF");
	carId.add("TATTIG");

	carId.add("TOYLAC");
	carId.add("TOYFOR");
	carId.add("TOYHIL");
	carId.add("TOYCAM");
	carId.add("TOYHLR");
	carId.add("TOYTAC");

	carId.add("MAHX300");
	carId.add("MAHSCOR");
	carId.add("MAHTHAR");
	carId.add("MAHX700");
	carId.add("MAHBOLE");
	carId.add("MAHT300");

	carId.add("MASAL80");
	carId.add("MASERTI");
	carId.add("MASAK10");
	carId.add("MASWAGR");
	carId.add("MASSWIF");
	carId.add("MASBALE");
  }
}

public class CarRentalSystem extends Customer{
	public static void main(String args[]){
		Customer c1=new Customer();
	    Car cars=new Car();
		//c1.validateUser();
		//cars.carBrand();
		//cars.carModel();
		cars.reservation();
	}
}