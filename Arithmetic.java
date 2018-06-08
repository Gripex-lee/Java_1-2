package day5_23;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		long a = br.nextLong();
		long b = br.nextLong();
		System.out.println("高精度整数number1："+a);
		System.out.println("高精度整数number2："+b);
		System.out.println("高精度整数加法："+(a+b));
		System.out.println("高精度整数减法："+(a-b));
		System.out.println("高精度整数乘法："+(a*b));
		System.out.println("高精度整数除法："+(a/b));
	}
}
