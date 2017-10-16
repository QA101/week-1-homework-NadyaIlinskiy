
public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 150;
		int y = 300;
		int max = 0;
		
		
		if (x > y) {
            max = x;
            System.out.println(max);
		}
		else if (y > x) {
			max =y;
			System.out.println(max);
			
	    }
		else {
			System.out.println("numbers are equel");
		}
	
	
	}

}
