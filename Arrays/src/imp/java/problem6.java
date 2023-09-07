//enter the user number if the user input and value are same print index number else print -1
package imp.java;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int val = sc.nextInt();
		int index = -1;
		int[] arr = {12,34,56,78,90};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				index = i;
				break;
			}
			
		}System.out.println(index);
		
		

	}

}
