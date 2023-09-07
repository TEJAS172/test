package imp.java;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax
		//dataType[][] nameOfArray = {{},{},{}};
		//dataType[][] nameOfArray = new dataType[no of rows][no of colums];
		
		//create an array
		int[][] arr = {//Example of jagged array
				{1,2,3},
				{4,5},
				{7,8,9}
		};
		
		//for user input
		int[][] arr1 = new int[3][3];
		
		//access the elementsof a 2D array;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
