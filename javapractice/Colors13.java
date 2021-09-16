/*
Write a program that has the user enter integers between 0 and 9999 unitl the user enters some 
integers twice. Your program then prints to the console window how many distinct integers were 
entered. You may assume all integers entered by the user are between 0 and 9999. Here are some
samples runs:
--------------------
Enter an int: 32
Enter an int: 32

You entered 1 value.
-------------------------
Enter an int: 32
Enter an int: 9285
Enter an int: 575
Enter an int: 7153
Enter an int: 8
Enter an int: 575

You entered 5 values. 
-------------------------

*/



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
          
          
          
          
