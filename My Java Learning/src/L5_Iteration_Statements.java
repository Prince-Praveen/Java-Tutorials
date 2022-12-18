
public class L5_Iteration_Statements {

	public static void main(String[] args) {

/*
 * 	Suppose if we want to print "Hello World" 5 times, its not that much difficult to print using println statement, but
 * 	what if we want to print it 100 times or more than that, it's not possible to print using println statement.
 * 	to solve this issue we have introduced Iteration Statement.
 * 
 * 		There are 4 types of iteration statements
 * 			1. while loop
 * 			2. do while loop
 * 			3. for loop
 * 			4. for-each loop (It's a special type of loop, specially used for arrays and collections)
 */
		
		
//		while loop
		
		System.out.println("** While Loop **\n");
		int i=1;
		while(i<=5) {
			System.out.println(i+" Hello World");
			i++;
		}
		System.out.println("\n");
		
		
//		do while loop
		
		System.out.println("** Do-While Loop **\n");
		int j=1;
		do {
			System.out.println(j+" Do-While Loop");
			j++;
		}while(j<=5);
		System.out.println("\n");
		
		
//		for loop
		
		System.out.println("** For Loop **\n");
		for(int k=0;k<=5;k++) {
			System.out.println(k+" For-Loop");
		}
	}

}
