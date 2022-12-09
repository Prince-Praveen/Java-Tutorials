public class L2_Variables {

	public static void main(String[] args) {
		
		// Syntax : Datatype variableName; (or) datatype VariableName = value;
		
		/*
		 * Rules to Declare a Variable :
		 * 
		 * A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ (underscore) and $ (dollar) sign.
		 * The first character must not be a digit.
		 * Blank spaces cannot be used in variable names.
		 * Java keywords cannot be used as variable names.
		 * Variable names are case-sensitive.
		 * There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
		 * Variable names always should exist on the left-hand side of assignment operators.
		 * 
		 */
		
		//Declearation
		int number = 5; // int -> 4 bytes (32 bits) -> range between (-2,14,74,83,648 to 2,14,74,83,647)
	    // changing the value 5 to 10
		number = 10;
		System.out.println(number);
		
		short s = 5; // short -> 2 bytes (16 bits) -> range between (-32,768 to 32,767)

		byte b = 5; // byte -> 1 byte (8 bits) -> range between (-128 to 127)
		
		float f = 50.50f; // float -> 4 bytes (32 bits)
		
		double d = 50.50; // double -> 8 bytes (64 bits)
		
		long l = 10000000000l; // long -> 8 bytes (64 bits)
		
		char c = 'A'; // char -> 2 bytes (16 bits)
		c = 66; // 66 is a ASCII value for 'B'  -> ASCII - Amarican Standard Code for Information Interchange
		
		
		/* Type Casting (converting one datatype to another)
		 *
		 * There are 2 types
		 * 1. Implicit conversion
		 * 2. Explicit conversion
		 * 
		 */
		
		double dd = 5; // implicit conversion -> double is converted into float
		
		int i = (int) 5.5; // explicit conversion -> float is converted into int (but we will loose some value, here we have lost 0.5 value)
	}

}