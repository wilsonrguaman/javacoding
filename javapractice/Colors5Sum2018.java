//import java.util.Scanner;

public class Colors5Sum2018
{
   public static void main(String[] args)
   {
   int count= 0;
   
   int a1[] = {15, 37, 46, 0, 8, 59, -3, 90};
 
  int num =  howManyDistinctValues (a1);
  
      System.out.print(num);
   
   }
   
   public static int howManyDistinctValues(int [] a)
   {
      int value = 0;
      int count = 0;
      
      for (int i = 0; i < a.length; i++)
      {
        count = 0;
           for(int j= i+1; j < a.length; j++)
             {
            
               if(a[i] == a[j])//when is distint we do the opposite side of != 
               {
               count++;
               }
             }

       if( count == 0) //First case at the part in the outer loop
              
         value++;
             
             
         
       }
       return value;
   }
}