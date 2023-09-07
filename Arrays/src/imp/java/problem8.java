//find pair whose sum is equals to k
package imp.java;

public class problem8 {
	class Data{
		int startingIndex;
		int endingIndex;
	}
	public static Data m1(int[] a,int k) {
		Data data = new Data();
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==k) {
					data.startingIndex = i;
					data.endingIndex = j;
				
				}
			}
		}
		return data;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,10,5,4};
		int k = 6;
		Data data = m1(arr,k);
		System.out.println(startingIndex+" "endingIndex);
		

	}

}
