//
package imp.java;

public class problem9 {
	public void m1(int[] a,int k) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==k) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,3,5,0,6};
		int k = 6;
		problem9 obj = new problem9();
		obj.m1(arr, k);

	}

}
