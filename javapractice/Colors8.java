public class Colors8 
{
   public static void main (String[] args)
   {
   int[] A = { 6, 8, 15, 22, 77, 93, 98};
   int[] B = { 5, 15, 22, 44, 93};
   
   int result = howManyInCommon(A, B);
   System.out.print(result);
   
   }
   public static int howManyInCommon(int [] A, int [] B)
   {
      int count = 0;
      
      for (int row = 0; row < A.length-1; row++)//arrays dont have the same length thats why we do -1
      {
         for (int column = 0; column < B.length; column++)
         {
               if( A[row] == B[column] )
               {
                    
                    count++;
               }
          }
       }
       return count;
    }
  }