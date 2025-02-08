package basics;

public class operators {
	public static void main(String[] args) {
		// Arithmetic Operators
		int a = 10;
		int b = 20;
		System.out.println(a + b); // 30, plus operator
		System.out.println(a - b); // -10, minus operator
		System.out.println(a * b); // 200, multiplication operator
		System.out.println(a / b); // 0, division operator, quotient
		System.out.println(a % b); // 10, modulus operator, remainder
		
		// Relational Operators
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true

		// Logical Operators
		boolean x = true;
		boolean y = false;

		// Short Circuit Operators
		/*
		 * A short circuit happens because the result is clear 
		 * even before the complete evaluation of the expression, 
		 * and the result is returned.
		 * x && y --> return false, if x false
		 * x || y --> return true, if x true
		 */

		System.out.println(x && y); // false
		System.out.println(x & y); // false
		System.out.println(x || y); // true
		System.out.println(x | y); // true
		System.out.println(!x); // false

		// Bitwise Operators
		int c = 10; // 1010
		int d = 20; // 10100
		System.out.println(c & d); // 0
		System.out.println(c | d); // 30
		System.out.println(c ^ d); // 30
		System.out.println(~c); // -11
		System.out.println(c << 2); // 40
		System.out.println(c >> 2); // 2
		System.out.println(c >>> 2); // 2

		// Assignment Operators
		int e = 10;
		int f = 7; 
		e += 2; // 12
		System.out.println(e);

		f = f + 2; // 9
		f++; // 10, post- increment operator
		f--; // 9, decrement operator
		++f; // 10, pre- increment operator
		int result = ++f; // first increment then assign
		result = f++; // first assign then increment
		System.out.println(f);
		e -= 2; // 10
		System.out.println(e);
		e *= 2; // 20
		System.out.println(e);
		e /= 2; // 10
		System.out.println(e);
		e %= 2; // 0
		System.out.println(e);
		e &= 2; // 0
		System.out.println(e);
		e |= 2; // 2
		System.out.println(e);
		e ^= 2; // 0
		System.out.println(e);
		e <<= 2; // 0
		System.out.println(e);
		e >>= 2; // 0
		System.out.println(e);


		
}
}
