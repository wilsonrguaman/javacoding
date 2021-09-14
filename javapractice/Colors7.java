import java.util.Scanner;
public class Colors7
{
   public static void main(String[] success)
   {
      Scanner kb = new Scanner(System.in);
      
      
      int a = 0;
      int b = 0;
      System.out.print("Enter a: ");
      a = kb.nextInt();
      System.out.print("Enter b: ");
      b = kb.nextInt();
      
      int base = a;
      int exponent = b;
      
     
      
      for(int i = 1; i < exponent; i++)
      {
        base = base * a;
          
       }
       System.out.println();
       System.out.print(a + " to the power " + b + " is " + base + ".");
       
      
   }
   
   
}