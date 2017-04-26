

public class MethodCalculatorDrive {
	public static void main(String [] args) {
		double [] num1 = new double [4];
		num1[0] = 4.0;
		num1[1] = 5.0;
		num1[2] = 6.0;
		num1[3] = 7.0;
		long [] num2 = new long [4];
		num2[0] = 3;
		num2[1] = 4;
		num2[2] = 5;
		num2[3] = 6;
		float [] num3 = new float [4];
		num3[0] = 2;
		num3[1] = 2;
		num3[2] = 2;
		num3[3] = 2;
		int [] num4 = new int [2];
		num4[0] = 3;
		num4[1] = 1;
		System.out.println("Sum of the numbers is " + MethodCalculator.getCalc(num1) + ".");
		System.out.println("Average of the numbers is " + MethodCalculator.getCalc(num2) + ".");
		System.out.println("Product of the numbers is " + MethodCalculator.getCalc(num3) + ".");
		System.out.println("Factorial of the numbers is " + MethodCalculator.getCalc(num4) + ".");



	}
}