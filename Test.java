package day5_29;

public class Test {
	public static void main(String[] args) {
		int[]b= {3,1,8,6,7,9};
		int[]c= {3,3,3,1,1,4};
		int temp;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length-1-i;j++) {
			if (c[j] < c[j+1]) {
				temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
				temp = b[j];
				b[j] = b[j+1];
				b[j+1] = temp;
			    }
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
