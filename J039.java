package day5_25;

public class J039 {
	public static void main(String[] args) {
		int sa=0,sb=0,sc=0,sd=0,se=0,sf=0,sg=0,sh=0;
		for(int a=0;a<=7;a++) {
			if(a%2!=0) {
				sa+=1;
			}
			for(int b=0;b<=7;b++) {
				if(b%2!=0&&b!=a) {
					sb+=1;
				}
				for(int c=0;c<=7;c++) {
					if(c%2!=0&&b!=c&&a!=c) {
						sc+=1;
					}
					for(int d=0;d<=7;d++) {
						if(d%2!=0&&b!=d&&a!=d&&c!=d) {
							sd+=1;
						}
						for(int e=0;e<=7;e++) {
							if(e%2!=0&&b!=e&&a!=e&&c!=e&&d!=e) {
								se+=1;
							}
							for(int f=0;f<=7;f++) {
								if(f%2!=0&&b!=f&&a!=f&&c!=f&&d!=f&&e!=f) {
									sf+=1;
								}
								for(int g=0;g<=7;g++) {
									if(g%2!=0&&b!=g&&a!=g&&c!=g&&d!=g&&e!=g&&f!=g) {
										sg+=1;
									}
									for(int h=0;h<=7;h++) {
										if(h%2!=0&&b!=h&&a!=h&&c!=h&&d!=h&&e!=h&&f!=h&&g!=h) {
											sh+=1;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("0~7组成1位数，有："+sa+"个");
		System.out.println("0~7组成2位数，有："+sb+"个");
		System.out.println("0~7组成3位数，有："+sc+"个");
		System.out.println("0~7组成4位数，有："+sd+"个");
		System.out.println("0~7组成5位数，有："+se+"个");
		System.out.println("0~7组成6位数，有："+sf+"个");
		System.out.println("0~7组成7位数，有："+sg+"个");
		System.out.println("0~7组成8位数，有："+sh+"个");
		System.out.println("总计为："+(sa+sb+sc+sd+se+sf+sg+sh));
	}
}
