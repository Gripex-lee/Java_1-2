package day5_23;
import java.util.Scanner;
import java.util.Arrays;

public class Compare {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int x=br.nextInt();
		int y=br.nextInt();
		int z=br.nextInt();
		int[] total = {x,y,z};
		br.close();
		Arrays.sort(total);
		System.out.println(total[0]+" "+total[1]+" "+total[2]);
	}
}
