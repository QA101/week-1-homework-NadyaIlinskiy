
public class DivisibleProgram {

	/*
	 * Define a program that determines whether a number x is divisible by a number y.
	 * 
	 * If x is divisble by y, the program will print TRUE otherwise FALSE
	 * 
	 * Such as:
	 * x -> 10
	 * y -> 5
	 * 10 divided by 5 is 2 with 0 remainder. The program would print true
	 */
	public static void main(String args[]){
		
		int x = 10;
		int y = 5;
		
		if (x%y == 0) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
	}
}
