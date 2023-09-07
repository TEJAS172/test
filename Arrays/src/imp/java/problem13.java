package imp.java;

import java.util.Scanner;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int r = sc.nextInt();
		
		System.out.println(("Enter the no of colums"));
		int c = sc.nextInt();
		
		System.out.println("Enter the values");
	
		
		int[][] arr = new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		System.out.println("Display in matrix form");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"");
				
			}
			System.out.println();
		}

	}

}
