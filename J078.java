package day5_30;

public class J078 {
	int x,y;
	double a,b,c;
	String m,n;
	J078(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(Math.max(x, y));
	}
	J078(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a*b*c);
	}
	J078(String m,String n) {
		this.m=m;
		this.n=n;
		if(m==n)
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void main(String[] args) {
		J078 x1=new J078(12,2);
		J078 x2=new J078(12.4,2.3,3.6);
		J078 x3=new J078("string","string");
	}
}
