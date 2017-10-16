
public class BetweenProgram {

	/*
	 * Write a program that determine if a number x is between 2 numbers y and z
	 * if x is between y and z, print TRUE otherwise print FALSE
	 * 
	 * example:
	 * x = 150
	 * y = 100
	 * z = 200
	 * should print TRUE
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 150;
		int y = 100;
		int z = 200;
		
		if (x > y && z > x) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
	}

}
