//write a program to fing the lenght of a string without using length();
package imp.java;

public class info1 {
	public static void m1(String str) {
		char[] letter = str.toCharArray();
		int count = 0;
		for(char ch:letter) {
			count++;
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "encyclopedia";
		info1.m1(str);
		
	}

}
