//
//	* Write a program that will find sum, subtraction, multiplication and division
//	and if one number bigger than other true or false for:
//	1) x = 175 / y =255
//	2) x = 25.75 / y = 17.34
//
//	* Write a program that will change values of variables:
// 	x=10 and y=5 => swap to make x=5 and y=10
//	x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
//	x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5

public class task4 {

	public static void main(String[] args) {
		
//		* Write a program that will find sum, subtraction, multiplication and division
//		and if one number bigger than other true or false for:
		
//		1) x = 175 / y =255
		
		int x = 175;
		int y = 255;
		
		String result = math1 (x,y);
		System.out.println(result);
		
//		2) x = 25.75 / y = 17.34		
		
		double foo = 25.75;
		double bar = 17.34;
		
		String result2 = math2 (foo,bar);
		System.out.println(result2);
		
//		* Write a program that will change values of variables:
		
//	 	x=10 and y=5 => swap to make x=5 and y=10
		int x1 = 10;
		int y1 = 5; 
		int temp1 = 0;
		temp1 = x1;
		x1 = y1;
		y1 = temp1;
		System.out.println(" x1 = "+ x1 +"; y1 = " + y1);
		
//		x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
		double x2 = 2.5;
		double y2 = 7.5; 
		double temp2 = 0;
		temp2 = x2;
		x2 = y2;
		y2 = temp2;
		System.out.println(" x2 = "+ x2 +"; y2 = " + y2);
		
//		x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
		int x3 = 10;
		int y3 = 5;
		int z3 = 12;
		int temp3 = 0;
		temp3 = x3;
		x3 = z3;
		z3 = y3;
		y3 = temp3;
		
		System.out.println(" x3 = "+ x3 +"; y3 = " + y3 +"; z3 = " + z3);
		
		
		
	}

	public static String math1 (int x, int y) {
		String result = " "; 
		
		int sum = x+y;
		int mtpl = x*y;
		int dev = x/y;
		String bigger = " ";
		if (x>y || y>x) {
			 bigger = "true";
		} else {
			 bigger ="false";
		}
		result = "sum is: " + sum + ", multiplication is: " + mtpl  + ", division is: " +  dev  + ", if one number bigger is: " +  bigger; 
		
		return result; 
		
	}
	
	public static String math2 (double x, double y) {
		String result = " "; 
		
		double sum = x+y;
		double mtpl = x*y;
		double dev = x/y;
		String bigger = " ";
		if (x>y || y>x) {
			 bigger = "true";
		} else {
			 bigger ="false";
		}
		result = "sum is: " + sum + ", multiplication is: " + mtpl  + ", division is: " +  dev  + ", if one number bigger is: " +  bigger; 
		
		return result; 
		
	}
	
	
	
}
