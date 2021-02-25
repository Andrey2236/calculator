package call;

public class Result {
 
	public static int result( String str, int index) {
		
		 int result = 0;
		 
		 StringFormat num =  new StringFormat();
		 
		String str1 = num.StrNum1(str, index);
		String str2 = num.StrNum2(str, index);

		Number r = new Number();
		
		
		 int num1 = r.rimNumber(str1);
			System.out.println(str1);
			
		 int num2 = r.rimNumber(str2);
			System.out.println(str2);
		
		
			String znak = str.substring(index,index+1);
			if(znak.equals("+")) {
				 result = num1+num2;
			} else if(znak.equals("-")) {
				 result = num1-num2;
			} else if(znak.equals("*")) {
				 result = num1*num2;
			} else if(znak.equals("/")) {
				 result = num1/num2;
			}
			return result;
	}
	
}
