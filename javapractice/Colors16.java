public class Colors16
{
   public static void main(String[] success)
   {
   
   boolean num = atLeastThreeMatch(0, 0, 7, 7);
  // boolean num = atLeastThreeMatch(5, 3, 5, 5);
   System.out.println(num);
   
   
   
   }
   
   public static boolean atLeastThreeMatch(int a, int b, int c, int d)
   {
      boolean value = false;
      
      if(a == b && b == c)
      {
         value = true;
      }
      else if( a == b && b == d)
      {
         value = true;
      }
      else if ( a == c && c == d)
      {
         value = true;
      }
      else if ( b == c && c == d)
      {
         value = true;
      }
     
    
    return value;
   }
  
   
 

}