package day5_24;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Char {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		br.close();
		int space=0;
		int number=0;
		int other=0;
		int alpha=0;
		String ch[]=str.split("");
		for(int i=0;i<ch.length;i++) {
			if(ch[i].matches(" ")) {
				space+=1;
			}else if(ch[i].matches("[0-9]")) {
				number+=1;
			}else if(ch[i].matches("[a-zA-Z]")) {
				alpha+=1;
			}else {
				other+=1;
			}
		}
		System.out.println("数字个数："+number);
		System.out.println("字母个数："+alpha);
		System.out.println("空格个数："+space);
		System.out.println("其他字符个数："+other);
	}
}
