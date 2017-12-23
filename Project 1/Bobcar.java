import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int economy = 25;
		int compact = 55;
		int standard = 100;
		int temp = 0;
		int discount = 0;
		int platCost = 0;
		String temp2 = "";
	
		System.out.println("We have three types of car");
		System.out.println("Choose 1 for economy, 2 for compact, 3 for standard");
		
		System.out.print("Please choose the rental car: ");
		int car = input.nextInt();
		if (car == 1){
			temp = economy;
			temp2 = "Economy";
		} else if(car == 2){
			temp = compact;
			temp2 = "Compact";
		} else if(car == 3){
			temp = standard;
			temp2 = "Standard";
		}
		
		System.out.print("Please enter the number of rental days: ");
		int days = input.nextInt();
		
		System.out.print("Club member?: 1 for yes, 0 for no: ");
		int member = input.nextInt();
		if(member == 1){
			discount = days/5;
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			int platinum = input.nextInt();
			if(platinum == 1)
				platCost = (int)(temp * 0.2); 	
		}
		int result =((temp) * (days - discount)  + platCost);
		
		
		System.out.println("Base: " + (days) + " days for a " + (temp2) + " at $" + (temp) + " per day: $" + (temp*days));
		if(member ==1 )
			System.out.println("Club Member Discount: " + "-$" + (discount * temp));
			System.out.println("Platinum Executive Package: " + "+$" + (platCost));
			
		System.out.println("Total cost is " + "$" + result);

		
	}

}
