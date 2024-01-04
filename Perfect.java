/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
 int N = Integer.parseInt(args[0]);
 int sum = 0;
 String isPerfect= N + " is a perfect number since " + N + " = 1";
      for ( int i = 2; i < N; i++ )
        {
        	if (N%i==0) 
        	{
              sum +=i;
        	  isPerfect  += " + " + i;
        }


        }

        if (sum + 1 == N)
        	System.out.println(isPerfect);
        else
        	 System.out.println(N + " is not a perfect number");

	}
}
