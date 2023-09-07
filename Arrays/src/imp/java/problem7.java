//WAP to replace duplicate if found with -1 and print an array
package imp.java;//2 for loops are required here

public class problem7 {
	public int[] m1(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=-1;
				}
			}
		}return a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] arr = {10,20,10,10,30,10};
	     
	     problem7 obj = new problem7();
	     int[] result = obj.m1(arr);
	     for(int data:arr) {
	    	 System.out.println(data);
	     }
	     
	}

}
