package day5_24;
import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		float x = br.nextFloat();
		br.close();
		double s=0;
		if(x<=10) {
			s=x*0.1;
		}else if(x>10&&x<=20) {
			s=(x-10)*0.075+10*0.1;
		}else if(x>20&&x<=40) {
			s=(x-20)*0.05+10*0.1+10*0.075;
		}else if(x>40&&x<=60) {
			s=(x-40)*0.03+10*0.1+10*0.075+20*0.05;
		}else if(x>60&&x<=100) {
			s=(x-60)*0.015+10*0.1+10*0.075+20*0.05+20*0.03;
		}else {
			s=(x-100)*0.01+10*0.1+10*0.075+20*0.05+20*0.03+40*0.015;
		}
		System.out.println("应提取的奖金是："+s+"万元");
	}
}
