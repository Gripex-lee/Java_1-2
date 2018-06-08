package day5_23;

public class Shuixian {
	public static void main(String[] args) {
		for(int n=100;n<1000;n++) {
			int b=n/100;
			int s=(n/10)-b*10;
			int g=n-b*100-s*10;
			if(Math.pow(b, 3)+Math.pow(s, 3)+Math.pow(g, 3)==n) {
				System.out.println("水仙花数："+n);
			}
		}
	}
}
