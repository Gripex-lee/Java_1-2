package day5_24;
import java.util.Scanner;
public class Threemu {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int x=br.nextInt();
		String str= (x%2==0)?"偶数 ":"奇数";
		System.out.println(str);
	}
}
