package call;

import java.util.Scanner;

public class StringFormat {
	static Scanner scan = new Scanner(System.in);

	
	public static String StrNum1(String str,int index) {
			String str2 = str.substring(0,index); 
			return str2;
	}
	
	public static String StrNum2(String str,int index) {
			String str2 = str.substring(index+1); 
			return str2;
	}
	public static   String getString() {
		System.out.println("Введите число");
		String str;
		str = scan.nextLine();
		return str;
		
	}
	

}
