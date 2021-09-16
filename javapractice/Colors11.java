/*
Write the method public static int rangeProduct(int a, int b) Assume tha a< b. Your method must compute
and return the product of the integers in the range from a to b. for example, if a = 3 and b =6, 
your method would compute and return thr product 3 x 4 x5x6 = 360

*/

import java.util.Scanner;
   public class Colors11
   {
      public static void main (String[] args)
      {
      
      Scanner kb = new Scanner(System.in);
      
      int n = rangeProduct(3, 6);
      
      System.out.println(rangeProduct(3, 6));
      
      }
      
      public static int rangeProduct(int a, int b)
      {
         
          
         int product = 1;
         
         for (int i = a; i <= b; i++)
         {
            product *= i;
   
        }
        return product;
   
    } 
 }      
                
   
   
 
 
