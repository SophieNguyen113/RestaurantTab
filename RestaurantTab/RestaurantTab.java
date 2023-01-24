import java.util.Scanner;
/**
  * Programming Project 1
  * This program completes a restaurant tab program.
  * @author Sophie Nguyen
  * @version 02/23/2022
  */

public class RestaurantTab
{
   public static void main(String[] args)
   {
      
      final double TAX_RATE_PERCENTAGE = 0.075; // Constant for a tax rate percentage of 7.5% 
      final double TIP_PERCENTAGE = 0.18;       // Constant for a tip percentage of 18% 
      
      Scanner in = new Scanner(System.in);
      System.out.print("What is the first name of the server? "); // Enter first name
      String firstName = in.next();
      System.out.print("What is the last name of the server? ");  // Enter last name
      String lastName = in.next();
      System.out.print("What is the charge for the meal? ");      // Enter the charge
      Double charge = in.nextDouble();
      
      System.out.printf("\n"); // Insert a newline
      System.out.println("Restaurant Bill Summary");
      
      firstName = firstName.substring(0,1); // Find the first character of the first name 
      System.out.println("Server: " + lastName + ", " + firstName); 
      
      System.out.printf("Meal:   $%,.2f \n", charge); // Display 2 decimal places and then insert a newline
            
      double tax = charge * TAX_RATE_PERCENTAGE;      // Find tax
      System.out.printf("Tax:    $%,.2f \n", tax);    // Display 2 decimal places and then insert a newline

      double originalTotal = charge + tax;            // Find original total equals charge plus tax
      
      double tip = originalTotal * TIP_PERCENTAGE;    // Find tip
      System.out.printf("Tip:    $%,.2f \n", tip);    // Display 2 decimal places and then insert a newline

      double finalTotal = originalTotal + tip;          // Find final total equals original total plus tip
      System.out.printf("Total:  $%,.2f", finalTotal);  // Display 2 decimal places     
   
   }
}