import java.util.Scanner;

public class Colors17
{
   public static void main(String[] args)
   {
   
   
   howManyEnteredBeforeSeenBoth(25, 17);
   
   }
   
   public static void howManyEnteredBeforeSeenBoth(int a , int b)
   {
   
    Scanner num = new Scanner (System.in);
   
   
      int count = 0;
      
      boolean a1 = false;
      boolean b2 = false;
      
      while (!(a1 && b2))
      {
         System.out.print("Enter an int: ");
         int input = num.nextInt();
         count++;
         if( input == a)
         {
            
            a1 = true;
          }
         if (input == b)
         {
            
            b2 = true;
         }
         //count++;//DO NOT FORGET TO COUNT AT THE END 
     }//end of loop
        System.out.println();
        System.out.println("You had to enter " + count + " integers before typing both " + a + " and " + b);
    }
 }
          
      
      
   