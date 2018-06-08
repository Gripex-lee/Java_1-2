package day5_25;

public class J042 {
	public static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=12;i++) {
			System.out.println("第"+i+"个月的兔子对数："+fib(i));
		}
	}
}
