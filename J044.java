package day5_25;

public class J044 {
	public static double funj(int n) {
		if(n==0) {
			return 1;
		}else {
			return funj(n-1)*n;
		}
	}
	public static void main(String[] args) {
		int i=1;
		float num=0;
		while(i<=20) {
			num+=1/funj(i);
			i++;
		}
		System.out.println(String.format("%.2f", num));
	}
}
