import java.util.Scanner;
   public class Colors13
{
      public static void main(String[] args)
      {
          Scanner kb = new Scanner(System.in);
          
          
          boolean[] array = new boolean[10000];
          int a;
          int count = 0;
          
          boolean value = true;
         
            while( value)
            {
              System.out.print("Enter an int: ");
               a = kb.nextInt();
            
               if( array[a] == false)
               {
                  array[a] = true;
                  count++;
               }
               else
               {
                  value = false;
               }
              }
              System.out.println();
              System.out.println("You entered " + count + " values");
          
       }
}  
          
          
          
          