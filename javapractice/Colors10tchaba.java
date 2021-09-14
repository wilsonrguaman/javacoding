public class Colors10tchaba
{
   public static void main(String[] args)
   {
      int[] y = {88,88,88,63,29,77,77,77,77,50,44,44,8,0,99,99};
      System.out.print(indexOfFirstPair(y));
   }
   public static int indexOfFirstPair(int[] arr)
   {
      int index = -1;
      
      int count = 0;
      for(int i = 0; i < arr.length - 1; i++)
      {
         if(arr[i] == arr[i + 1])
         {
            count++;
         }
         else
         {
            if(count == 1)
            {
            index = i - 1;
            i = arr.length - 1;
            }
            else
            {
               count = 0;
            }
         }
      }
      return index;
   }
}