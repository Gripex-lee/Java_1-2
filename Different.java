package day5_24;

public class Different {
	public static void main(String[] args) {
		int[] num= {1,2,3,4};
		int[] number=new int[24] ;
		int x=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				for(int k=0;k<num.length;k++) {
					if(num[i]!=num[j]&&num[j]!=num[k]&&num[i]!=num[k]) {
						x+=1;
						number[x-1]=num[i]*100+num[j]*10+num[k];
					}
				}
			}
		}
		for (int b=1;b<number.length;b++) {
			System.out.print(number[b-1]+" ");
			if(b%5==0) 
				System.out.println();
		}
		System.out.println();
		System.out.println("共有"+x+"种情况");
	}
}
