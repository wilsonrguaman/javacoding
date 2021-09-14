import java.util.Scanner;
public class Colors6
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int count = 0;
      int a = 0;
      int b = 0;
      int c = 0;
      
      System.out.print("Enter a: ");
      a = kb.nextInt();
      System.out.print("Enter c: ");
      b = kb.nextInt();
      System.out.print("Enter b: ");
      c = kb.nextInt();
      
      System.out.println();
      
      if(a % 2 !=0 )
      {
         count++;
      }
      if (b % 2 != 0)
      {
         count++;
      }
      if(c % 2 != 0)
      {
         count++;
      }
      if ( count == 0)
      {
         System.out.println("No integers were odd ");
      }
      else if ( count == 1)
      {
         System.out.println("One integers were odd");
      }
      else if( count == 2)
      {
         System.out.print("Two integeres were odd");
      }
      else if ( count == 3 )
      {
         System.out.print("Three integers were odd ");
      }
      
   }
}