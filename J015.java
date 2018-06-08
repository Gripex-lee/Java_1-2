package day5_23;
import java.util.Scanner;
public class J015 {
	public static void main(String[] args) {
		System.out.println("输入你的身高(米)和体重(千克)：");
		Scanner br= new Scanner(System.in);
		float height = br.nextFloat();
		float weight = br.nextFloat();
		float BMI = weight/(height*height);
		if(BMI>24.0) {//查询到的标准
			System.out.println("超重");
		}else if(BMI<=18.4){
			System.out.println("偏瘦");
		}else if(BMI>18.5 && BMI<23.9){
			System.out.println("正常");
		}
	}
}
