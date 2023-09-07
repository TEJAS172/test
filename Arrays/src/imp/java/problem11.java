package imp.java;

public class problem11 {
	private static int m1(int[] a) {
		int count = 0;
		for(int data:a) {
			if(data==0)count++;
		}
		return count;
	}
	public static void m2(int[] a) {
		int zeros = m1(a);
		for(int i=0;i<zeros;i++) {
			a[i] = 0;
		}
		for(int i=zeros;i<a.length;i++) {
			a[i] = 1;
		}
		for(int data:a) {
			System.out.println(data+" ");
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,0,1,1,0,0,0,1,1,0,0,0};
		m2(arr);

	}

}
