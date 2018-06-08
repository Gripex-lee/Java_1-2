package day5_25;
import java.util.Scanner;
public class J045 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int m=br.nextInt();
		br.close();
		int []arr= {1,2,3,4,5,6,7,8,9};
		int []brr= new int[9];
		for(int i=1;i<=9-m;i++) {
			brr[m+i-1]=arr[i-1];
		}
		for(int j=9-m+1;j<=9;j++) {
			brr[j-(9-m+1)]=arr[j-1];	
		}
		for(int k=0;k<brr.length;k++) {
			System.out.print(brr[k]+" ");
		}
	}
}
