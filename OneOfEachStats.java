import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
// public class OneOfEachStats {
// 	public static void main (String[] args) {
// 		// Gets the two command-line arguments
// 		int T = Integer.parseInt(args[0]);
// 		int seed = Integer.parseInt(args[1]);
// 		// Initailizes a random numbers generator with the given seed value
//         Random generator = new Random(seed); 
//         double rnd = generator.nextDouble();




// 		boolean boy = false;
// 		boolean girl = false;
// 		int sum = 0;//children in each family
// 	    int sum2 = 0;
// 	    int sum3 = 0;
// 	    int sum4 = 0;
// 	    double a = 0;
// 	    int allChildren = 0;//all the children
// 	    String common = "wrong";

// 		for (int i =0 ; i< T ; i++)
// 		{

// 		 while (boy == false || girl == false )
// 	 	 {
// 	 	    if ( generator.nextDouble() < 0.5) 
// 	 	 	 	boy = true;

// 	 	 	 else
// 	 	 	 	girl = true;

// 	 	 	 sum +=1;

// 	 	 	 //allChildren ++;

// 	 	 }
// 	 	 allChildren = allChildren+sum;

// 	 	 if (sum>= 4)
// 	 	 	sum4 ++;
// 	 	 else
// 	 	 {
// 	 	 	if(sum == 2)
// 	 	 		sum2 ++;
// 	 	 	else
// 	 	 		sum3++;
// 	 	 }


// 			 boy = false;
// 			 girl = false;
// 			 sum = 0;

// 	    }

	    
// 	    if ((sum4>sum2)&&(sum4>sum3))
// 	    		common = "4 or more";
// 	    else
// 	    {
// 	    	if (((sum3>sum2)&&(sum3>sum4)) || ((sum3>sum2)&& (sum3==sum4)) )
// 	    		common = "3";
// 	    	else
// 	    	{
// 	    	     common = "2";
// 	       }
// 	    }

// 		System.out.println(allChildren);
// 		System.out.println(allChildren/T);



// 		// double average = allChildren/T;
// 		System.out.println("Average: " + (double) allChildren / T + " children to get at least one of each gender.");
// 		System.out.println("Number of families with 2 children: " + sum2);
// 		System.out.println("Number of families with 3 children: " + sum3);
// 		System.out.println("Number of families with 4 or more children: " + sum4);
// 		System.out.println("The most common number of children is " + common + ".");


		
// 		//// In the previous version of this program, you used a statement like:
// 		//// double rnd = Math.random();
// 		//// Where "rnd" is the variable that stores the generated random value.
// 		//// In this version of the program, replace this statement with:
// 		//// double rnd = generator.nextDouble();
// 		//// This statement will generate a random value in the range [0,1),
// 		//// just like you had in the previous version, except that the 
// 		//// randomization will be based on the given seed.
// 		//// This is the only change that you have to do in the program.
		    
// 	}
// }


public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  

		int totalChildren = 0;
        int twoChildrenCount = 0;
        int threeChildrenCount = 0;
        int fourOrMoreChildrenCount = 0;
		String firstMostCommon = "";
		for  (int i = 0; i < T; i++) {
			int childrenCount = 0;
			boolean boyBorn = false;
			boolean girlBorn = false;
			while (!(boyBorn && girlBorn)) {
				if (generator.nextDouble() < 0.5) {
					boyBorn = true;
				} else {
					girlBorn = true;
				}
				childrenCount++;
			}
			totalChildren = totalChildren + childrenCount;
			if (childrenCount == 2) {
				twoChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("2");
			}
			if (childrenCount == 3) {
				threeChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("3");
			}
			if (childrenCount > 3) {
				fourOrMoreChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("4");
			}
		}
		
		System.out.println("Average: "+ (double) totalChildren / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildrenCount);
		System.out.println("Number of families with 3 children: " + threeChildrenCount);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildrenCount);
		if ((twoChildrenCount > threeChildrenCount && twoChildrenCount > fourOrMoreChildrenCount) || (firstMostCommon.charAt(0) == '2') ){
			System.out.println("The most common number of children is 2.");
		}
		else if ( (threeChildrenCount > twoChildrenCount && threeChildrenCount > fourOrMoreChildrenCount) || (firstMostCommon.charAt(0) == '3') ) {
			System.out.println("The most common number of children is 3." );
		}		
		else if ((fourOrMoreChildrenCount > threeChildrenCount &&  fourOrMoreChildrenCount > twoChildrenCount) || (firstMostCommon.charAt(0) == '4' ) ) 
		{
			System.out.println("The most common number of children is 4 or more." );
		}

					



	}
}