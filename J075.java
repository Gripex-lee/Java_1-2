package day5_29;

import java.util.Scanner;

public class J075 {
     public static void main(String args[]) {
     int n=3;
/*	 Scanner br = new Scanner(System.in);
     System.out.print("请输入盘数：");
	 n = br.nextInt();*/
	 J075 hanoi = new J075();
	 hanoi.move(n, 'A', 'B', 'C');
	 System.out.println((int)(Math.pow(2, 3)-1));
     }
     public void move(int n,char a,char b,char c) {
    	 if (n==1) {
    		System.out.println("从 "+a+" 移动盘子 "+n+" 号到 "+c);
    	 }
    	 else {
    		move(n-1,a,c,b);
    		System.out.println("从 "+a+" 移动盘子 "+n+" 号到 "+c);
    		move(n-1,b,a,c);
    	 }
     }
}
