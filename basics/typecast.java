package basics;

public class typecast {
	public static void main(String[] args) {
		// Typecasting
		// 1. Implicit typecasting (Widening) - CONVERSION // No need to CAST
		// 2. Explicit typecasting (Narrowing) - CASTING // Need to CAST

		// Implicit typecasting (Widening)
		// byte -> short -> int -> long -> float -> double
		// char -> int -> long -> float -> double

		// byte -> short -> int -> long -> float -> double
		byte byteNum = 4;
		short shortNum = byteNum;
		int intNum = shortNum;
		long longNum = intNum;
		float floatNum = longNum;
		double doubleNum = floatNum;
		System.out.println(doubleNum);

		// char -> int -> long -> float -> double
		char ch = 'k';
		int chInt = ch;
		long chLong = chInt;
		float chFloat = chLong;
		double chDouble = chFloat;
		System.out.println(chDouble);

		// Explicit typecasting (Narrowing)
		// double -> float -> long -> int -> short -> byte
		// double -> float -> long -> int -> char

		int a = 11;
		byte b = (byte) a;
		System.out.println(b);


		float f = 12.5f;
		int i = (int) f;
		System.out.println(i);

		int aNum = 257;
		byte bNum = (byte) aNum; 
		// 257 % 256 [range of byte] = 1
		System.out.println(bNum);


		// TYPE PROMOTION
		byte x = 10;
		byte y = 30;
		int z = x * y; // type promotion
		// int z = (int) x * y; // 300
		System.out.println(z);

	}	
}
