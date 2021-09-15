/*
In US currency, a quater is worth 25 cents, a nickel is worth 5 cents, and a penny is worth 1 cent.
Write a java program that prompts the user to enter an integer representing a dollar amount that consists of all
pennies. You may assume the user input value is greater than zero. The program is to distribute that amount into
quaters, nickels and pennies, using as few coins as possible. Note: you may not use any currency values other than 
quarters, nickels, and pennies. 
*/

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
   
