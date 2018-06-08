package day5_30;

public class J077 {
	public static int a = 1;
    public static int b = 3;
    public static String str;
//jingtai daima kuai:
    static {
        str = "I am lee";
        a = 10;
        b = 30;
    }

    public static void main(String[] args) {
        System.out.println(J077.str);
        System.out.println(J077.a);
        System.out.println(J077.b);
    }
}
