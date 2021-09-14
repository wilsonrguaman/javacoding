public class Colors9
{
      public static void main(String[] args)
      {
      
         int [] A = { 6, 103, 77, 49, 0, 83, 77, 77, 444, 444};
      
         int num [] =  newSmallerArray(A, 77);
         
       
       
          for (int i = 0; i < num.length; i ++)
          {
            
          
        
           System.out.print(num[i] + " " );
        }
      }
      
      public static int[] newSmallerArray(int[] A, int b)
      
      {
         int count = 0;
         
         for( int row = 0; row < A.length; row++)
         {
            if (A[row] == b)
            
               count++;
         }
         int [] Aarray = new int[A.length - count];
         
            int index = 0;
               
          for (int i = 0; i < A.length; i++)
                  {
                   if ( A[i] != b)
                      {
                       Aarray[index] = A[i];//Evertime we create a new array we need a new variable to act as index
                       //for the new array
                         index++;
                       }
                       
                  }
                 return Aarray;
 
            
      }
   
   
   }
 

                          