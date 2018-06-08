package day5_24;

public class Sq {
	public static void main(String[] args) {
		for(int i=1;i<10000;i++) {
			double x=Math.sqrt(i+100);
			double y=Math.sqrt(i+100+168);
			if(x==(int) x&&y==(int)y) {
				System.out.print(i+" ");
			}
		}
	}
}
