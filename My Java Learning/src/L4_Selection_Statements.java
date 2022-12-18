
public class L4_Selection_Statements {

	public static void main(String[] args) {
		
//		if-else Statement
//		If the condition satisfy then if block of statements will be executed, if the condition does not satisfy then else block of statement will be executed

//		Suppose, we want to check wheather the number is even or odd number
		
		int n=6;
		
		System.out.println("** If-Else Selection Statement **");
		
		if(n == 0) {
			System.out.println("Nothing");
		}
		else if(n%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		System.out.println("\n");
		
		
		
//		Ternary Operator -> condition?exp1:exp2;
//		If the condition is true then exp1 will be executed, if the condition is false then exp2 will be executed
		
//		Suppose, we want to assign j=1 if the value of 'a' is greaterthan 0 and
//		j=-1 if the value of 'a' is lessthan 0
		
		int a=2;
		int j=0;
		
		System.out.println("** Ternary Operator/Selection Statement **");
		
		j = a>0?1:-1;
		
		System.out.println(j);
		
		System.out.println("\n");
		
		
		
//		Switch Statement
//		Switch Statement supports datatype as int,char and string(above 1.7 version)
		
//		suppose, we want to print week days according to the number, i.e, if the number is 1 then we have to print sunday, and so on upto 7 
//		and if the number is  other than 1 to 7, then we have to print error
		
		int number=1;
		
		System.out.println("** Switch Selection Statement **");
		
		switch(number) {
		
		case 1:
			System.out.println("Sunday");
			break;
		
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Error, Please Re-enter the number !!!");
		}
	}

}