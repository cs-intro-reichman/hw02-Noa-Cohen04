/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) 
	{
		int T = Integer.parseInt(args[0]);
		boolean boy = false;
		boolean girl = false;
		int sum = 0;//children in each family
	    int sum2 = 0;
	    int sum3 = 0;
	    int sum4 = 0;
	    int a = 0;
	    int allChildren = 0;//all the children
	    double average = 0;
	    String common = "wrong";

		for (int i =0 ; i< T ; i++)
		{
			 boy = false;
			 girl = false;
			 sum = 0;

		 while (boy == false || girl == false )
	 	 {
	 	 	a = (int)( 2 * Math.random() ) ;
	 	 	if (a == 0)
	 	 	 {
	 	 	 	boy = true;

	 	 	 }
	 	 	 else
	 	 	 {
	 	 	 	girl = true;
	 	 	 }
	 	 	 sum +=1;
	 	 	 allChildren ++;
	 	 	


	 	 }

	 	 if (sum>= 4)
	 	 	sum4 ++;
	 	 else
	 	 {
	 	 	if(sum == 2)
	 	 		sum2 ++;
	 	 	else
	 	 		sum3++;
	 	 }
	    }

	    
	    if ((sum4>sum2)&&(sum4>sum3))
	    		common = "4 or more";
	    else
	    {
	    	if (((sum3>sum2)&&(sum3>sum4)) || ((sum3>sum2)&& (sum3==sum4)) )
	    		common = "3";
	    	else
	    	{
	    	     common = "2";
	       }
	    }

	average = (double)allChildren/T;
	      System.out.println("Average: " + average + " children to get at least one of each gender.");
	      System.out.println("Number of families with 2 children: " + sum2);
	      System.out.println("Number of families with 3 children: " + sum3);
	      System.out.println("Number of families with 4 or more children: " + sum4);
          System.out.println("The most common number of children is " + common + ".");


}
}
