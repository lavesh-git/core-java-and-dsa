package basics;

public class controlflow {
	public static void main(String[] args) {
		// if else
		int num = 10;
		if (num > 0) {
			System.out.println("Positive number");
		} else 
			System.out.println("Negative number");
		// single line = no need for curly braces

		// if else if else
		num = 0;
		if (num > 0) {
			System.out.println("Positive number");
		} else if (num < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Zero");
		}

		// ternary operator
		int c = 10;
		int d = 20;
		int result = (c > d) ?c: d;
		System.out.println(result); 


		// switch
		int day = 3;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("Other day");
		}

		// 	NEW SWITCH CASE
		String dayString = "Wednesday";
		String res = "";

		switch (dayString) {
			case "Saturday", "Sunday" -> System.out.println("Weekend");
			case "Monday" -> System.out.println("8 AM");
			default -> res = "10 AM";
		}
		
		res = switch (dayString) {
			case "Saturday", "Sunday" -> "Weekend";
			case "Monday" -> "8 AM";
			default -> "10 AM";
		};

		res = switch (dayString) {
			case "Saturday", "Sunday" : yield "Weekend";
			case "Monday" : yield "8 AM";
			default : yield "10 AM";
		};

		System.out.println(res);

		// LOOP:
		// do-while
		int i = 1; // iterator variable
		do {
			System.out.println("Do-While: " + i);
			i++;
		} while (i <= 5);

		// while
		int j = 9;
		while (j >= 0) {
			System.out.println("While: " + j);
			j--;
		}

		// for
		for (int k = 1; k <= 5; k++) {
			System.out.println("For: " + k);
		}

		int m = 1;
		for(; m<= 9 ;){
			System.out.println("For: " + m);
			m++;
		}

		// nested for
		for (int l = 1; l <= 3; l++) {
			for (int n = 1; n <= 3; n++) {
				System.out.println("Nested For: " + l + " " + n);
			}
		}


		// for-each
		int[] numbers = {10, 20, 30, 40};
		for (int x : numbers) {
			System.out.println("for-each: " + x);
		}

		// JUMP
		// 1. break
		for (int a = 1; a <= 5; a++) {
			if (a == 3) {
				break; // Stops the loop when i = 3
			}
			System.out.println("Count: " + a);
		}
		
		// 2. continue
		for (int ia = 1; ia <= 5; ia++) {
			if (ia == 3) {
				continue; // Skips iteration when i = 3
			}
			System.out.println("Count: " + ia);
		}
		






	}
}
