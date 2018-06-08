package day5_24;

public class Day {
	public static void main(String[] args) {
		String date="2014-10-25";
		String[] date2=date.split("-");
		String month =date2[1];
		String day = date2[2];
		int m=Integer.parseInt(month);
		int d=Integer.parseInt(day);
		int index=0;
		if(m<=7) {
			if(m==1) {
				index=d;
			}
			if(m==2) {
				index=31+d;
			}
			if(m>=2&&m%2==0) {
				index=59+((m-4)/2)*61+31+d;
			}else{
				index=59+((m-3)/2)*61+d;
			}
		}else {
			if(m%2==0) {
				index=59+31+30+31+30+31+((m-8)/2)*61+d;
			}else {
				index=59+31+30+31+30+31+31+((m-9)/2)*61+d;
			}
		}
		System.out.println("2014-10-25是这年的第"+index+"天。");
	}
}
