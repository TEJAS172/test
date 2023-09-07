package imp.java;

import java.util.Scanner;

public class prac {
	public void m1(int a,int b) {
		if(a>b) {
			System.out.println("a is greater");
		}if(a<b) {
			System.out.println("B is greater");
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no");
		int a = sc.nextInt();
		
		System.out.println("Enter second nu");
		int b = sc.nextInt();
		
		prac obj = new prac();
		obj.m1(a, b);
		
	
	}

}
