package call;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
	      
	     public boolean flag( String str1) {
	    	  Pattern rimPatern = Pattern.compile("[I|x|X|i|v|V]");
			   Matcher r = rimPatern.matcher(str1);
			   boolean rimFormat = r.find ();
			   return rimFormat;
	     }
       	
	
		public  int rimNumber(String str1) {
			 int num1 = 0;
			 
			   
			  boolean rimFormat = flag(str1);
			   
			   
			   
			   if(rimFormat == true) {
				   str1 = str1.toUpperCase();  
			if(str1.equals("I")) {
				 num1 = 1;
			} else if(str1.equals("II")) {
				 num1 = 2;
			} else if(str1.equals("III")) {
				 num1 = 3;
			} else if(str1.equals("IV")) {
				 num1 = 4;
			} else if(str1.equals("V")) {
				 num1 = 5;
			} else if(str1.equals("VI")) {
				 num1 = 6;
			} else if(str1.equals("VII")) {
				 num1 = 7;
			} else if(str1.equals("VIII")) {
				 num1 = 8;
			} else if(str1.equals("IX")) {
				 num1 = 9;
			}else if(str1.equals("X")) {
				 num1 = 10;
			}
			   }else   {
				    num1 = Integer.parseInt(str1.trim());
		   }
			   return num1;
			    
		}
		
		

}
