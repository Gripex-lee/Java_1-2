package day5_23;
import java.util.Scanner;
public class YearR {
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		int year = re.nextInt();
		re.close();
		if ((year%4==0 && year%100 !=0)||(year%400 ==0)) {
			System.out.println(year+"年是闰年");
		}else {
			System.out.println(year+"年不是闰年");
		}
	}
}
