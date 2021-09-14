public class Colors2
{
   public static void main(String[] args)
   {
      
      int [] fre = { 3, 1, 5, 2};
      char[] tex = { 'm' , 's', 'k', 'p'};
      char[] chec = repeatChars(fre, tex);
      
      System.out.print( chec);
      
      
      
      
      
      
      
   }
   public static char[] repeatChars(int [] freq, char[] text)
   {
   
         int sum = 0;
        
        for(int i = 0; i < freq.length; i++)
        {
            sum = sum + freq[i];
            
        }
        char[] matrix = new char[sum];
        
        int texto = 0;
        
        for(int j = 0; j < text.length; j++)
        {
         for (int k = 0; k < freq[j]; k++)
           {
            matrix[texto] = text[j];//Why sometimes we need an element to be inside the loop or why we can't sometimes because it will creat outbounce 
            texto++;//we have texto because the array is a different lenght
           }
        }
        return matrix;
     }
  
         
}