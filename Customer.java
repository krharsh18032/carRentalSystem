package carRentalSystem;
import java.util.Scanner;
public class Customer extends Thread{
	Scanner input=new Scanner(System.in);
	private String key="harsh024";
	private String value="123456";
	private String Firstn,Lastn,Mobile,Aadhar,address,pickup,pin;
	private String[] credentials={"First Name","Last name","Mobile number","Aadhar number","Full address","Pickup Location","PIN code"};
	private String[] values = new String[credentials.length];

	private String username,password;
	public boolean validateUser(){
	System.out.println("\n\n\n\n"+"""

|                                                   Welcome to Our Car Rental Service!                                                           |
|              We're thrilled to have you on board. Our platform is designed to provide you with a seamless car rental experience.               |
|              Whether you are planning a road trip or need a vehicle for a few hours, we've got you covered. As a new user, you                 |
|              willl find a wide range of cars to choose from. Each car is well-maintained and sanitized, ensuring your safety and               |
|              comfort. Plus, our transparent pricing and easy booking process make renting a car hassle-free.                                   |
|                              If you need any assistance, our support team is just a click away.                                                |
|                                                         Enjoy the ride!                                                                        |

	""");
	System.out.println("\n\n\n****************************************************||  LOGIN/SIGNUP SECTION  ||*********************************************");
	System.out.println("Are you a new user ?\nYes\nNo\n");
	String begin=input.nextLine();
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
			e.printStackTrace();
	}
	if(begin.equalsIgnoreCase("YES")){
		System.out.print("\nCreate a Username:");
		String uname=input.nextLine();
		key=uname;
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.print("Create a password:");
		String pass=input.nextLine();
		value=pass;

        for (int i = 0; i < credentials.length; i++) {
            System.out.print("Enter " + credentials[i] + ": ");
            values[i] = input.nextLine();
        }
		System.out.println("\n           ACCOUNT CREATED SUCCESSFULLY");
		login();
	}
	else if(begin.equalsIgnoreCase("NO")){
		login();
	}
	return true;	
	}
	
	public boolean login(){
		System.out.println("\n--------------------------------------------------Please enter your login details below:---------------------------------------");
	do{
		System.out.print("Username:");
		username=input.nextLine();

		System.out.print("Password:");
		password=input.nextLine();

		if(!(username.equals(key) && password.equals(value))){
			try{
				  Thread.sleep(1000);
	        }
	        catch(InterruptedException e){
			      e.printStackTrace();
	        }
			System.out.println("\n\nIncorrect username or password !");
			System.out.println("\nDo you want to continue ?\nYES\nNO");
			String exit=input.nextLine();

			if(exit.equalsIgnoreCase("No")){
				System.exit(0);
			}
		}
		if(username.equals(key) && password.equals(value)){
			System.out.println("--------------------------------------------------Successfully Logged In!----------------------------------------------- ");
			return true;
		}
	}
	while(!(username.equals(key) && password.equals(value)));
	
	return true;
	}
}