package basics;
public class variables {
	public static void main(String[] args) {
		
		/* DATA TYPES */
		// -128 to 127 , 8 bits = 1 byte
		byte byteNum = 4;
		System.out.println(byteNum);

		// byte byteNum2 = 129;
		// System.out.println(byteNum2); 
		// error: incompatible types: possible lossy conversion from int to byte

		// other data types: short (16 bits, 2 bytes)

		// int (4 bytes, 32 bits) ~ 10^9
		int num1 = 3;
		System.out.println(num1);

		// long (64 bits, 8 bytes) , suffix `l` can be skipped
		long longNum = 23423l; 
		System.out.println(longNum);

		// double (15 decimals), 64 bits
		// default data type for decimal numbers
		double num2 = 4.5; // 8 bytes
		System.out.println(num2);

		// float num2 = 3.5; float takes 32 bits
		// Type mismatch: cannot convert from double to float
		float num3 = 4.5f; // 4 bytes
		System.out.println(num3);

		// JAVA char (2 bytes) follows UNICODE and not ASCII
		// C++ follows ASCII characters and thus its char has 1 byte
		char ch = 'k'; // 2 bytes, single quotes
		System.out.println(ch);

		// char ch2 = "k"; 
		// System.out.println(ch2);
		// error: incompatible types: String cannot be converted to char

		String s = "abd";
		System.out.println(s);

		// boolean (1 bit), true or false, and doesnt support 0 or 1
		boolean flag = true; // true, false
		// bool b = 0; // Type mismatch: cannot convert from int to boolean
		System.out.println(flag);



		/* LITERALS */

		int num4 = 0b101; // binary of 5
		System.out.println(num4);

		int num5 = 0x1A; // hexadecimal of 26
		System.out.println(num5);

		int num6 = 100_00_00_00; // 100000000
		System.out.println(num6);
		// _ can be used to separate digits for better readability

		double num7 = 56;
		System.out.println(num7); // 56.0

		double num8 = 7e10; // 7 * 10^10
		System.out.println(num8); // 7.0E10

		double num9 = 7e5; // 7 * 10^5
		System.out.println(num9); // 700000.0

		char ch2 = '\u0061'; // unicode of 'a'
		char ch3 = 'a'; 
		char ch4 = 99; // ASCII of 'c'
		ch3++;
		System.out.println(ch2); // a
		System.out.println(ch3); // b 
		System.out.println(ch4); // c

	}
	
}
