package day5_24;

public class Wannumber {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
