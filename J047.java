package day5_25;

import java.util.Scanner;
public class J047 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String m=br.nextLine();
		br.close();
		String[]arr=m.split("");
		String[]brr=new String[4];
		for(int i=0;i<4;i++) {
			brr[i]=arr[arr.length-i-4];
		}
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]);
		}
	}
}
