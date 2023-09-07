//to rpint a count of even number
package imp.java;

public class problem2 {
	public int m1(int[] a) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,12,14};
		problem2 obj = new problem2();
		int result = obj.m1(arr);
		System.out.println(result);
	}

}
