package day5_24;
import java.util.Scanner;
public class Func {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		double x=br.nextDouble();
		br.close();
		double y=0;
		if(x<1) {
			y=x;
		}else if(x>=1&&x<10) {
			y=3*x-2;
		}else {
			y=4*x;
		}
		System.out.println("y="+y);//如何保留一位小数
	}
}
