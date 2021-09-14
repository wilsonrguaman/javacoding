import java.util.Scanner;
public class Colors3 
{  
   public static void main(String[] args)
   {
      
    Scanner kb = new Scanner(System.in);
  
  
  //THREE CONSECUTIVE VALUES 
  
  
   int input = 0;
   int saveInput = 0;
   int count = 0;
   
   do{
      System.out.print("Enter an integer: ");
      input = kb.nextInt();
      
      if( count == 0)// first case first to save the first entering 
      {
         saveInput = input;
         count++;
      }
      else if( input == saveInput)
      {
          
          count++;//Only count if they are equal to each other
      }
       else
       {
         saveInput = input;
         count = 1;// we keep count as 1 for the previus element the was entered/
   //WHEN we refer as consecutive values we keep count as ONE 
       }
    }while ( count < 3);
    
      System.out.println();
      
      System.out.println("Same entered " + count + " in a row ");
  }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   /*
    
    System.out.print("Enter an integer: ");
    int n = kb.nextInt();
    System.out.print("Enter an integer: ");
    int m = kb.nextInt();
    System.out.print("Enter an integer: ");
    int p = kb.nextInt();
   
    
    while(n != m || m != p )
    {
        n = m;
        m = p;
       
      System.out.print("Enter an integer: " );
       p = kb.nextInt();
      
    }
    System.out.println();
    System.out.println("Same entered 3 in a row " );
    
    
  }
}*/