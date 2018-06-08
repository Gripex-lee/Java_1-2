package day5_23;
import java.util.Scanner;
public class Random {
	public static void main(String[] args) {
		Scanner br= new Scanner(System.in);
		int n = br.nextInt();
		br.close();
		for(int j = 0; j< n; j++){  
		    System.out.println((int)(Math.random()*10000000));  
		}
	}
}