
public class L3_Operators {

    /*
     * Operators
     * 
     * Arithmetic -> +,-,*,/,%
     * Bitwise    ->
     * Relational ->
     * Logical    ->
     * 
     */
	
	public static void main(String args[]) {
		
//		Arithmetic Operators -> +,-,*,/,%
		
		int a=6,b=3;
		int addition = a+b;
		int substraction = a-b;
		int multiplication = a*b;
		int division = a/b;
		int mod = a%b;
		
		System.out.println("** Arithmetic Operators **\n");
		System.out.println(" Addition of a and b is : "+addition +
				"\n Substraction of a and b is : "+substraction +
				"\n Multiplication of a and b is : "+multiplication +
				"\n Division of a and b is : "+division +
				"\n Mod of a and b is : "+mod+"\n");
		
//		 Short-hand Operators
		int x = 10,y=5;
		
		System.out.println(" Initial value of x : "+x+"\n Initial value of y : "+y);
		
		x += y; // x = x + y
		
		System.out.println(" Current value of x : "+x+"\n Current value of y : "+y+"\n");
		
//		Pre & Post Increment
		
		int p=1,q=2,r=3,s=4;
		System.out.println(" Initial value of p : "+p+"\n Initial value of q : "+q);
		p = p++;
		System.out.println(" Value of p after post-increment : "+p);
		q = ++q;
		System.out.println(" Value of q after pre-increment : "+q+"\n");
		
		System.out.println(" Initial value of r : "+r+"\n Initial value of s : "+s);
		r = r--;
		System.out.println(" Value of r after post-decrement : "+r);
		s = --s;
		System.out.println(" Value of s after pre-decrement : "+s+"\n");
		
		
	}
}
