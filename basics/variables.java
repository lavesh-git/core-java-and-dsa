package basics;
public class variables {
	public static void main(String[] args) {
		
		// -128 to 127 , 8 bits
		byte byteNum = 4;
		System.out.println(byteNum);

		// other data types: short (16 bits)

		// int (32 bits) ~ 10^9
		int num1 = 3;
		System.out.println(num1);

		// long (64 bits) , suffix `l` can be skipped
		long longNum = 23423l; 
		System.out.println(longNum);


		// float num2 = 3.5; float takes 32 bits
		// Type mismatch: cannot convert from double to float

		// double (15 decimals), 64 bits
		double num2 = 4.5; 
		System.out.println(num2);

		float num3 = 4.5f; 
		System.out.println(num3);

		char ch = 'k'; // 2 bytes
		System.out.println(ch);

		String s = "abd";
		System.out.println(s);

		boolean flag = true; // true, false
		System.out.println(flag);
	}
	
}
