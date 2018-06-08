package day5_25;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class J038 {
	public static double Function(int n) {
		double x=0;
		if(n%2==0) {
			for(double i=2;i<=n;i+=2) {
				x+=1/i;
			}
		}else {
			for(double i=1;i<=n;i+=2) {
				x+=1/i;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		br.close();
		System.out.println(String.format("%.2f", Function(n)));
	}
}	
