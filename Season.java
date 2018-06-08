package day5_24;

import java.util.Scanner;
public class Season {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int x=br.nextInt();
		br.close();
		switch(x) {
		case 1:
		case 2:
		case 3:
			System.out.println("您输入的月份属于春季");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("您输入的月份属于夏季");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("您输入的月份属于秋季");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("您输入的月份属于冬季");
			break;
		}
	}
}
