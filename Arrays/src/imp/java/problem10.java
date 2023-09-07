//sort an array in ascending as well as decending order
package imp.java;

public class problem10 {
	public void m1(int[] a) {
		int k = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		for(int data:a) {
			System.out.println(data);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,0,11,0,1,0};
		problem10 obj = new problem10();
	    obj.m1(arr);
		

	}

}
