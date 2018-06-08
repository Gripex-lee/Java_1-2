package day5_24;
import java.text.DecimalFormat;
public class Sum_xiaoshu {
	public static void main(String[] args) {
		float a=1;
		float b=2;
		float q=2;
		for(int i=1;i<=19;i++) {
			float temp=a;
			a=b;
			b+=temp;
			q+=b/a;
		}
		DecimalFormat df = new DecimalFormat("#.00");  
		System.out.println("前二十项之和是："+df.format(q));
	}
}
