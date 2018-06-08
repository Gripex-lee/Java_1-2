package day5_25;

public class J046 {
	public static void main(String[] args) {
		int []arr= {0,1,2,3,4,5,6,7,8,9};
		int []brr= new int[10];
		for(int i=0;i<=9;i++) {
			brr[i]=arr[9-i];
		}
		for(int k=0;k<brr.length;k++) {
			System.out.print(brr[k]+" ");
		}
	}
}
