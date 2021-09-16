/*

Write the method public static int largestInCommon (int[] A, int[] B)
This method takes two arrays A and B, each containing positive integers only (no error checking necessary)
and returns the largest value that is common to both A and B. If there is no value that is contained in both 
A and B, return the value -1. 

*/


public class Colors14
   {
      public static void main(String[] args)
      {
        
         int[] c = {3, 8, 5, 2, 7, 9};
         int[] d = {5, 1, 22, 7, 2, 15, 3};
         int[] e = {35, 12, 19, 35, 45};
         int[] f= {55, 99, 12};
         int[] A = {33,11,77,44,55};
         int[] B = {99,88,222,0,1000};
         
        
        
          System.out.println(largestInCommon(c,d));
          System.out.println(largestInCommon(e,f));
          System.out.println(largestInCommon(A,B));
        
      
      }
      
      
      public static int largestInCommon(int[] A, int[] B)
      {
              int value = -1;
              int larger = 0;
              
         
            for(int i = 0; i < A.length; i++)
            {
            for(int j = 0; j < B.length; j++)
                  {
                      if ( A[i] == B[j] )
                       { 
                        // if (A[i] > value)
                         larger = Math.max(A[i], value); 
                         {
                             larger = A[i];
                             value = larger;
                         }
                       }
                
                   }
              
             }
              
              return value;
        }       
               
 }
      
       
      
   
