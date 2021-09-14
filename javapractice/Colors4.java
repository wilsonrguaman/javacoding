import java.util.Scanner;
public class Colors4
{
   public static void main(String[] success)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter value: ");/// DONT FORGET IS DOUBLE 
      double numeroUno = kb.nextDouble();
      System.out.print("Enter value: ");
      double numeroDos = kb.nextDouble();
      System.out.print("Enter value: ");// DO THIS PROBLEM OVER AGAING ABOUT ENTERING DOUBLE AND CONDITIONS STATEMENTS 
    
      double numeroTres = kb.nextDouble();
      System.out.print("\n");
      
      
      if( numeroUno < numeroDos && numeroDos < numeroTres)/// becarefule wiht the condition < 
      {
         System.out.println("INCREASING" );
         
       }
      else if (numeroUno > numeroDos && numeroDos > numeroTres)
      {
         System.out.println("DECREASING");
       }
       else
       {
         System.out.println("NEITHER");
       }
      
      
   }
 }