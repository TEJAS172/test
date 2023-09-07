package imp.java;

public class problem3 {
	public static int m1(int[] a) {
		int sum = 0;
		for(int data:a) {
			if(data%2==1) {
				sum = data+sum;//sum+ = data;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,2,1,2};
		int result = m1(arr);
		System.out.println(result);

	}

}
