public class Colors5and5
{
      public static void main(String[] args)
      {
      int []array1 = {55, 33, 22 };
      int []array2 = {7 ,6, 55, 33, 22, 1};
      
     // int []array1 = { 5, 3, 2};
      //int []array2 = { 5, 66, 44, 3, 2, 11};
      
     // int []array1 = { 5, 3, 2};
     // int []array2 = { 5, 3, 3, 3, 2};
      
      //int []array1 = {50, 49, 48, 60, 53};
     // int []array2 = {50, 49, 48, 60};
     
      boolean array = appearsConsecutively(array1, array2);
      System.out.println(array);
      
      
      }
      
      public static boolean appearsConsecutively(int[] A, int [] B)
      {
         boolean result = false;
         int Aindex = 0;
         int count = 0;
         
         if (B.length >= A.length)
         {
            for(int i = 0; i < B.length; i++)
            {
               if(B[i] == A[Aindex])//Distinct the opposite !=
               {
                  Aindex++; 
                  count++;
               }
               else
               {
                  Aindex = 0;// must reset for the new variable because is less
                  count = 0;
               }
               if( count == A.length)
                  {
                     result = true;
                     i = B.length;//avoid outofbouncing 
                  }
            }//everything inside the loop
             
         }//the if statement will close at the end 
         return result;
     }
 }
   