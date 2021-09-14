import java.util.Scanner;
public class Col2018
{
   public static void main(String[] args)
   {
   
   Scanner kb = new Scanner(System.in);
   
   boolean num = isSquareSum(41);
   System.out.println(num);
   
   }
   
   public static boolean isSquareSum(int c)
   {
      boolean check = false;
      
      
     
      int sum = 0;
      
      for(int a = 1; a < c; a++)
      {
        
        for( int b = 1; b < c; b++)
        {
            sum = ( a * a) + ( b * b);
          
            if ( sum == c)
            {
               
               check = true;
              
              /// System.out.println( a + " "  +  " " +  b  + "  " + sum);
                a = c;
                b = c;//existing the loops
            }
         }
       }
    
    
    return check;
   
   
   }
}