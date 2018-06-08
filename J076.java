package day5_30;

public class J076 {
		private J076() {
			//define
		};
		private static J076 lazyman=null;//不用的时候不定义
		public synchronized static J076 getman() {
			if(lazyman==null) {
				lazyman = new J076();
			}
			return lazyman;
		}
		//test
		public static void main(String[] args) {
			J076 lazyman = J076.getman();
			System.out.println(lazyman.toString()); 
		}
}
/*
 * 懒汉式:用的时候，才去创建对象
单例模式的一般步骤:
1、私有化构造方法使其外部不能直接创建对象保证对象的唯一性
2、私有化和静态化自己内部的对象(因为外部不能new对象只能内部来new了)
3、提供一个公共的静态的方法给外部直接使用自己内部创建的对象
*/
