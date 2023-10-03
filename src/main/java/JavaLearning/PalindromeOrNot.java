package JavaLearning;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the word");
//		String word=sc.next();
//		//System.out.println("Entered"+word);
		//palindromeOrNot(word);
//		System.out.println(fun("werrew"));
//		System.out.println(fun(""));
//		
//		System.out.println(fun("q"));
		String s="                              ";
		System.out.println(s.length());
		

	}
	
	public static String fun(String str)
	{
		if(str.length()>0)
		{
			if(str.charAt(0)==str.charAt(str.length()-1))
			{
				fun(str.substring(1, str.length()));
			}
			else
				return "Not Palindrome";
			
		}
		else
			return "Not Palindrome";
		return "palindrome";
	}

	public static boolean palindromeOrNot(String word) {
		
		String ans="";
		word=word.toLowerCase();
		char[] ch = word.toCharArray();
		int f = 0;
		int l = ch.length - 1;
		if (ch.length == 0) {
			System.out.println("word should be a null");
		} else if (ch.length == 1) {
			System.out.println("It is single character");
			return true;
		} else {
			while (f < l) {
				char temp=ch[l];
				ch[l]=ch[f];
				ch[f]=temp;
				f++;
				l--;

			}

		}
		for(int i=0;i<ch.length;i++) {
			
			ans+=ch[i];
		}
		if(ans.equalsIgnoreCase(word)) {
			System.out.println("Is palindrome");
			return true;
		}
		System.out.println("Is not palindrome");
		return false;
			
		

	}

}
