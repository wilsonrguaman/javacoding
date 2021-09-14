import java.util.Scanner;
public class Colors6version
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   
   
   
      int count = 0;
      int save = 0;
      int n = 0;
      
      do{
         System.out.print("Enter an integer: ");
         n = kb.nextInt();
         
         if( count == 0)
         {
            count++;
            save = n;
         }
         else if( save == n)
         {
            count++;
         }
         else
         {
            save = n;
            count = 1;//previus number save. we cannot reset to zero.
        }
     }while ( count < 3);
    System.out.println("Same entered " + count + " in a row ");
  }
}