package JavaLearning;
import java.util.*;

public class Arrayintro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[3];
		String ar4[]=new String[3];
		boolean ar5[]=new boolean[3];
		char ar1[]=new char[4];
		double ar2[]=new double[2];
		System.out.println(ar2.getClass().getName());
//		System.out.println(ar4.getClass().getName());
		System.out.println(ar5.getClass().getName());
		System.out.println(ar1.getClass().getName());
		System.out.println(ar.getClass().getName()); 
		for(int i=0;i<3;i++) {
			System.out.println("enter a integer");
			ar[i]=sc.nextInt();
		}
		for(int a:ar) {
			System.out.println(a);
		}
		System.out.println();
	}

	private static Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
