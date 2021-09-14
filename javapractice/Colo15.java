import java.util.Scanner;
public class Colo15
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   
   System.out.print("Enter an integer: ");
   int number = kb.nextInt();
   
   System.out.println("To make " + number + " cents, you need: ");
   
   int quarters = number / 25;
   int nickels = number % 25;
   int numberofnickels = nickels / 5;
   int pennies = nickels % 5; 
  
   
   System.out.println( quarters + " quarters ");
   System.out.println( numberofnickels + " nickels ");
   System.out.println( pennies + " pennies ");
      
   
   }
 }
   