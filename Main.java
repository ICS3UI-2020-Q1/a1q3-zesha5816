import java.util.Scanner;
/**
 * program that will prompt the user how many of each item they want to purchase. Your program will then calculate the subtotal (how much does it cost all together without taxes), the amount to taxes (13%) and the total.

 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		// ask user for the quanity the need for each item
		System.out.println("How many chromebook chargers?");
		int chargers = input.nextInt();
		System.out.println("How many motherboards?");
		int motherboards = input.nextInt();
		System.out.println("How many mice?");
		int mice = input.nextInt();
		/**
		double CHROMEBOOK_CHARGER = 34.99;
		double REPLACEMENT_MOTHERBOARD = 127.50;
		double COMPUTER_MOUSE = 18.00;
		*/
		//calculates the subtotal without taxes
		double subtotal = chargers * 34.99 + motherboards * 127.50 + mice * 18.00;
		// outputs the subtotal to the user
		System.out.println("Subtotal= $" + subtotal);
		// calculates the taxes
		double taxes = subtotal * 0.13;
		//outputs the user of the taxes
		System.out.println("Taxes = $" + taxes);
		//calculates the total
		double total = taxes + subtotal;
		//outputs the total to the user 
		System.out.println("Total = $" + total);


    
  }
}
