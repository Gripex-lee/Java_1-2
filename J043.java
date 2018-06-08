package day5_25;
public class J043 {
	public static int funj(int n) {
		if(n==0) {
			return 1;
		}else {
			return funj(n-1)*n;
		}
	}
	public static void main(String[] args) {
		System.out.println(funj(5));
	}
}
