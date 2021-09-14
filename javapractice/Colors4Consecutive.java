import java.util.Scanner;

   public class Colors4Consecutive
   {
      public static void main(String[] args)
      {
      Scanner kb = new Scanner (System.in);
      
      int sum = 0;
      int count = 0;
      int num = 0;
      int a = 0;
      
      
      do{
      
        
         System.out.print("Enter an int: ");
         a = kb.nextInt(); 
         
         sum = sum + a;
         
         if (count == 0)
         {
            count++;
            num = a;
          }
          else if ( num + 1 == a)
          {
            count++;
            num = a;
          }
         
          else 
          {
            count =  1;
            num = a;
          }
          
         }while( count < 3);
          
          System.out.println(sum);
          
        
        
     }
 }
    