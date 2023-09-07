//largest number of an array
package imp.java;

public class problem4 {
	public static void m1(int[] a) {
		int largestNumber = a[0];
		int second = a[1];
		for(int i=0;i<a.length;i++) {
			if(largestNumber<a[i]||second<largestNumber) {
				largestNumber = a[i];
				second = a[i];	
			}
		}System.out.println(largestNumber+""+second);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000,21,34,102,76,98};
		problem4 obj = new problem4();
		obj.m1(arr);
		

	}

}
