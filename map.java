package day5_23;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class map {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("apple","苹果");
		map.put("orange","橘子");
		map.put("banana","香蕉");
		Scanner br = new Scanner(System.in);
		String str = br.nextLine();
		br.close();
		System.out.println(map.get(str));
	}
}