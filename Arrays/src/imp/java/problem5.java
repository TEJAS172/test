package imp.java;

public class problem5 {
	public static int m1(int[] a) {
		int smallNumber = a[0];
		for(int i=0;i<a.length;i++) {
			if(smallNumber>a[i]) {
				smallNumber=a[i];
			}
		}
		return smallNumber;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,78,2};
		int result = m1(arr);
		System.out.println(result);

	}

}
