package basics;
import java.util.Scanner;

class hello{
	// ENTRY POINT OF CODE: MAIN FUNCTION
	public static void main(String args[]){

		/* TAKING INPUT & PRINTING IT */
		Scanner sc = new Scanner(System.in);  
        String input = sc.nextLine();  
        System.out.println("You entered: " + input);
        sc.close();

		/* OUTPUT TO STDOUT: PRINTLN (NEW-LINE) AND PRINT */
		System.out.println("Hello Lavesh!");
		// println will print a new line too 
		System.out.print("Hello newine!");
	}


	public void mainDemo(String args[]){
		// see that this doesn't have 'static' keyword and run 
		// button is not appearing
		
		/*
		 * MULTI
		 * LINE 
		 * COMMENT
		 */

		// SINGLE LINE COMMENT
	}
}

/* 
DIRECTLY WRIRING  
System.out.println("Hello");

GIVES THE BELOW ERROR
hello.java:1: error: class, interface, enum, or record expected

JAVA EXPECTS US TO WRITE IN A CLASS THAT HAS THE SAME NAME
AS THE FILE NAME. 

ALSO THEN WE NEED TO HAVE public static void main()
FUNCTION WHICH IS THE ENTRY POINT OF CODE. 

static -- allows the system to call basics.main without creating
an object
*/

// hello.class is our bytecode (.class) for hello.java 
// run bytecode using `java <filename_without_extension>
