package day5_24;

public class Sunumber {
	public static void main(String[] args) {
		for(int n=2;n<100;n++) {
			int j=2;
			while(n%j!=0) {
				j++;
			}
			if(j==n) {
				System.out.println("素数："+n);
			}
		}
	}
}
