import java.util.Scanner;

public class Colors13version3
{  
   public static void main (String[] args)
   {
   
      Scanner kb = new Scanner(System.in);
      
      
      int count = 0;
      int input = 0;
      
      int[] arr = new int [10000];
      
      do{
      
         System.out.print("Enter an integer: ");
         input = kb.nextInt();
         arr[input]++;//Insert the input inside the array [ input  ] than increment 
            
         count++;
         
         
         }while(arr[input] < 2);
         
         System.out.println();
         System.out.println("You enterd " + ( count -1 ) + " value." );
 
   
   
   }
   
 }