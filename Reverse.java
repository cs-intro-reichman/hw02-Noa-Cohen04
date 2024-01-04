/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse
 {
	public static void main (String[] args)
	{
	// Gets n from the user
      String str = (args[0]);
      char letter = '4';
      char middle = '4';
      String reverseWord = "";
      for ( int i = 0; i < str.length() ; i++ )
        {
        	 letter = str.charAt(str.length() -1 -i);
        	 reverseWord = reverseWord + letter;
        	 // first for odd second for even 
        	// if (((str.length()-i-1) ==  i)||(str.length()-i) ==  i)
         if (((str.length()-i-1) ==  i)||(str.length()-i) ==  i)
          {
          	middle = letter;
          }
          
          
        }
          System.out.println(reverseWord);
          System.out.println("The middle character is " + middle);
 
                
    }
}
 