package day5_23;
import java.util.Scanner;
public class Double {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		double a = br.nextDouble();
		double b = br.nextDouble();
		java.text.DecimalFormat  df  =new  java.text.DecimalFormat("#.00000000"); 
		System.out.println(df.format(a));
		System.out.println("x+y="+df.format(a+b));
		System.out.println("x-y="+df.format(a-b));
		System.out.println("x*y="+df.format(a*b));
		System.out.println("x/y="+df.format(a/b));
	}
}