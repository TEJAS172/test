package imp.java;

public class problem14 {
	public int m1(int[] a) {
		int count = 0;
		for(int data:a) {
			if(data%2==0)count++;
		}
		for(int data:a) {
			if(data%2==1)count++;
		}
		
		return count;
	}
	public void m2(int[] a) {
		int even = m1(a);
		int odd = m1(a);
		for(int i=0;i<even;i++) {
			a[i] = even;
		}
		for(int j=even;j<a.length;j++) {
			a[j] = odd;
		}
		for(int data:a) {
			System.out.println(data+" ");
		}
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		
		problem14 obj = new problem14();
		obj.m2(arr);
		
		

	}

}
