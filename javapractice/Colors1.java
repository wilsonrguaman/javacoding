public class Colors1
{
   public static void main(String[] success)
   {
   
   int[][] array ={{ 5, 10, 1, 5,},
                   { 1, 2, 1, 15,},
                   { 8, 7, 5, 3, },
                   { 6, 1, 12, 1}};
                   
   int matrix = indexOfHighestRowSum( array);
   System.out.print(matrix);
   
   
   }
   public static int indexOfHighestRowSum(int[][] A)
   {
      int index = 0;
      int sum = 0;
      int largaSuma = 0;
      int count = 0;
      
      
      for(int row = 0; row < A.length; row++)
      {
        // sum = 0; you can also reset the sum in here 
        for(int colum = 0; colum < A[row].length; colum++)
         {
          sum = sum + A[row][colum];
          //each row and colum gets sum 
         } 
         if(count == 0)//Starting point to start the problem// first case in case the first row has the larger sum
         {
            largaSuma = sum;
            index = row;
            count++;
         }
        else if( sum > largaSuma)// othere wise will be zero if you dont star
         {
           largaSuma = sum; 
            index = row; 
         }
        sum = 0; // reset the sum
      }//first outer loop checks every row.
       
       return index;
   }
   
   
   
   
}