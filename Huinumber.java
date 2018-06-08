package day5_24;
import java.util.Scanner;
public class Huinumber {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String x=br.nextLine();
		String[]arr=x.split("");
		if(arr[1].equals(arr[3])&&arr[0].equals(arr[4])) {
			System.out.println("该数字是回文数字");
		}else {
			System.out.println("该数字不是回文数字");
		}
	}
}
