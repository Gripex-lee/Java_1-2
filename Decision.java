package day5_24;
import java.util.Scanner;
public class Decision {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		float x=br.nextFloat();
		br.close();
		String str=(x>=90)?"A":((x>=60)?"B":"C");
		System.out.println("等级为:"+str);
	}
}
