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
                
   
   
 
 