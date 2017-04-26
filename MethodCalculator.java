

public class MethodCalculator {
	public static double getCalc(double [] num1) {
		return num1[0] + num1[1] + num1[2] + num1[3];
	}
	public static long getCalc(long [] num2) {
		long sum=0;
		for(int i=0; i<num2.length;i++) {
			sum+=num2[i];
		}
		return(sum/num2.length);
	}
	public static float getCalc(float [] num3) {
		return num3[0]* num3[1] *num3[2]* num3[3];
	}
	public static int getCalc(int [] num4) {
		int sum2 = num4[0] + num4[1];
		int FinalCalc = 1;
		for(int a =1;a <= sum2;a++) {
			FinalCalc = FinalCalc * a;
		}
		return	FinalCalc;	
	}
	
}