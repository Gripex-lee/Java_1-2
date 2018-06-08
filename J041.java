package day5_25;
import java.text.DecimalFormat;
import java.util.Scanner;
public class J041 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		br.close();
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("您的累计消费金额为："+df.format(n));
		switch(n/200) {
		case 1:
			System.out.println("您将享受九五折优惠！");
			break;
		case 2:
			System.out.println("您将享受九折优惠！");
			break;
		case 3:
			System.out.println("您将享受八五折优惠！");
			break;
		case 4:
			System.out.println("您将享受八三折优惠！");
			break;
		case 5:
			System.out.println("您将享受八折优惠！");
			break;
		case 6:
			System.out.println("您将享受七八折优惠！");
			break;
		case 7:
			System.out.println("您将享受七五折优惠！");
			break;
		case 8:
			System.out.println("您将享受七三折优惠！");
			break;
		case 9:
			System.out.println("您将享受七折优惠！");
			break;
		case 10:
			System.out.println("您将享受六五折优惠！");
			break;
			default:
				System.out.println("您将享受六折优惠！");
		}	
	}
}
