package day5_24;
import java.util.Scanner;
public class J025 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		String[] s=str.split("");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[s.length-i-1]);
		}
	}
}
