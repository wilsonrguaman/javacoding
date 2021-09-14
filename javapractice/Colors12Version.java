import java.util.Scanner;
public class Colors12Version
{
   public static void main(String[] args)
   {
   
   Scanner kb = new Scanner(System.in);
   
   System.out.print("Enter a: ");
   int a = kb.nextInt();
   
   System.out.print("Enter b: ");
   int b = kb.nextInt();
   System.out.print("Enter c: ");
   int c = kb.nextInt();
   System.out.println();
   
   int max = Math.max(Math.max(a, b ), c);
   int count = 0;
   
  if(max == a)
   {
    count++;   
   }
   if(max == b)
    {
     count++; 
    }
   if(max == c )
    {
      count++;
    }
   // System.out.print("The largest integer " +  max + " was entered "); 
   
   if( count == 1)
   {
   System.out.print("The largest integer " +  max + " was entered once ");
     // System.out.print("once ");
   }
   else if ( count == 2)
   {
      System.out.print("twice ");
    }
   else 
   {
      System.out.print("three times ");
   }
  }
}
   
  
  
  
   
   
   
 