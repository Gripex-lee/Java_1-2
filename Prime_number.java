package day5_23;

public class Prime_number {
	public static void main(String[] args) {
		for(int n=101;n<201;n++) {
			int j=2;
			while(n%j!=0) {
				j++;
			}
			if(j==n) {
				System.out.println(n);
			}
		}
	}
}
