import java.awt.print.Printable;

public class Post_Pre_Incrementor {

	  static int a = 10 ;
	  static int b = 0 ;
	  static int c = 10 ;
	  static int d = 0 ;
public static void  Pre_Incrementor() {
		         // ++ x 
		  int b = ++ a ;
		  System.out.println("Solving with expression [ b = ++a  ]");
		  System.out.println("The value of A using Pre increment is :  " + a );
		  System.out.println("The value of B usng Pre increment is :  " + b );
		//  int b  =  ++a  + a ;   -->  in this case first the A will be incremented  then  the incremented value will be set to  B along with
		  //   A itself .  Then the final incremented A will be added to the 
	}

public static  void  Post_Incrementor () {
	          //  a++ 
	
	int d = c++ ;
	  System.out.println("Solving with expression [ b = a++ ] ");
	  System.out.println("The value of D using Post increment is :  " + d );
	  System.out.println("The value of C usng Post  increment is :  " + c );
	
}
	
	
	
	
	
	public static void main(String[] args) {
			
		
		Pre_Incrementor();
		System.out.println();
		System.out.println();
		Post_Incrementor();
	}

}
