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