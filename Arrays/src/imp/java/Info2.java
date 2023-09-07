package imp.java;

public class Info2 {
	public static void m1(String str) {
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int num = ch+32;
			char newChar = (char)num;//typecasting;
			str2 = str2+newChar;
			
		} 
		System.out.println(str2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TEJAS";
		Info2.m1(str);

	}

}
