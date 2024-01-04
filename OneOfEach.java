
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args)
	{
	 boolean boy = false;
	 boolean girl = false;
	 int sum = 0;
	 int a = 0;

	 	 while (boy == false || girl == false )
	 	 {
	 	 	 a = (int)( 2 * Math.random() ) ;
	 	 	 if (a == 0)
	 	 	 {
	 	 	 	boy = true;
	 	 	 	System.out.print("b ");

	 	 	 }
	 	 	 else
	 	 	 {
	 	 	 	girl = true;
	 	 	 	System.out.print("g ");
	 	 	 }
	 	 	 sum +=1;

	 	 }

	 System.out.println("\nYou made it... and you now have " + sum + " children.");

	}
}
