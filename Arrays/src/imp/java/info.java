package imp.java;

public class info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a string object
		//by literals
		//scp-string constant pool
		//scp cant allow the duplicate memory
//		String str = "Tej";
//		System.out.println(str.hashCode());
//		
//		String str2 ="Java";
//		System.out.println(str2);
//		
//		String obj = "tejas";
//		String obj2 = obj;
//		obj = null;
//		String obj3 = obj2;
//		System.out.println(obj+" "+obj2+" "+obj3);
//		
//		//Accessing the String object;
//		String obj4 = "Hello bro";
//		System.out.println(obj4.charAt(0));
		
		//Methods in String
		//concat()
		String obj6 = "Boot";
		System.out.println(obj6.concat("Teee"));
		
		//CharAt(index)
		for(int i=0;i<4;i++) {
			System.out.println(obj6.charAt(i));
		}
		
		//split-> String[];
		String obj8 = "Tejas is a good boy";
		String[] words = obj8.split(" ");
		
		
		
				
		
		
			
		}
		
		

	}


