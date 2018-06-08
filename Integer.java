package day5_24;
import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int x=br.nextInt();
		int a=x/10000;//万
		int b=x/1000-a*10;//千
		int c=x/100-a*100-b*10;//百
		int d=x/10-a*1000-b*100-c*10;//十
		int e=x-a*10000-b*1000-c*100-d*10;//个
		
		int ordx=e*10000+d*1000+c*100+b*10+a;
		System.out.println(ordx);
	}
}
