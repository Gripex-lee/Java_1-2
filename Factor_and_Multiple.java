package day5_23;
import java.util.Scanner;
public class Factor_and_Multiple {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int a=br.nextInt();
		int b=br.nextInt();
		br.close();
		for(int i=Math.min(a, b);i>0;i--) {
			if(a%i==0 && b%i == 0) {
				System.out.println("最大公约数为："+i);
				break;
			}
		}
		for (int j=Math.max(a, b);j<a*b+1;j++) {
			if(j%a==0 && j%b ==0) {
				System.out.println("最小公倍数为："+j);
				break;
			}
		}
	}
}
