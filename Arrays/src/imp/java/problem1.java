//to print sum of all the elements of an array
package imp.java;

public class problem1 {
	
	public static int m1(int[] a) {
	 int sum = 0;
	
	 for(int i=0;i<a.length;i++) {
		 sum += a[i];
		 
	 }
		
	//System.out.println(sum);
	 return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,14,15,10};
		int result = m1(arr);
		System.out.println(result);
	}

}
