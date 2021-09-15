/*

Write the method below that takes an integer array myArray. The method returns the value in array myArray that appears the most. For example, if myArray were the array
below, the method would return the value 39, because 39 appears five times in myArray and no other integer appears that many times.
You may assume that some value in myArray does appear more frequently than all others. 
myArray = { 81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
*/

public class Color18
{
   public static void main(String[] args)
   {
      
     int[] n = { 81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39}; 
    
     
     int check = mostFrequentValue(n);
     
         System.out.print(check);
   }
   
   public static int mostFrequentValue(int[] myArray)
   {
   
            int count = 0;
            int value = 0;
            int max = 0;
      
      for (int i = 0; i < myArray.length; i++)
      {
         for(int j = 0; j < myArray.length; j++)
         {
         
            if(myArray[i] == myArray[j] )
            {
               count ++; 
            }
            if ( count > max )//check if count is greater then update max
            {
               max = count;
               value = myArray[i];
               
            }
        } 
      }
          return value;
      }
      
    
      
}
