package day5_23;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int a= br.nextInt();
		int b= br.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" "+b);
		br.close();
	}
}
