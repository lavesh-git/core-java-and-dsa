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
		int i = 10;
		int j = 20;
		int result = (i > j) ? i : j;
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

		// LOOP:
		// do-while
		int i = 1;
		do {
			System.out.println("Count: " + i);
			i++;
		} while (i <= 5);

		// while
		int j = 1;
		while (j <= 5) {
			System.out.println("Count: " + j);
			j++;
		}

		// for
		for (int k = 1; k <= 5; k++) {
			System.out.println("Count: " + k);
		}

		// for-each
		int[] numbers = {10, 20, 30, 40};
		for (int x : numbers) {
			System.out.println(x);
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
