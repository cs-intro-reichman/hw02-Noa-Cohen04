/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	 int a = (int)( 10 * Math.random() ) ;
	 System.out.print(a + " ");
	 int b = (int)( 10 * Math.random() ) ;
	 while (a<b)
	 {
	 	System.out.print(b + " ");
	 	a = b;
	 	b = (int)( 10 * Math.random() ) ;
	 }
	}
}
