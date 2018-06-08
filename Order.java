package day5_23;
import java.util.Arrays;
public class Order {  
    public static void main(String[] args) {
    	String s = "dgdge,ssdfd,adsdf,ewsvs";
    	String[] strs = s.split(",");
    	Arrays.sort(strs);
    	for (int i=0;i<strs.length;i++) {
    		System.out.println(strs[i]);
    	}
    }
} 