package JavaLearning;
import java.util.*;


public class MyClass {
	public static void main(String args[]) {
	String Str="sowmya";
	System.out.println(isPalin(Str));

}
	public static boolean isPalin(String s) {
		char [] c=s.toCharArray();
		int start=0;
		int end=c.length-1;
		
			while(start<end) {
				if(c[start]!=c[end]) {
					return false;
					
				}
				start++;
				end--;
					
			}
			return true;
		}
}