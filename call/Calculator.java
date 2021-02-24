package call;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		 try{
		StringFormat sf = new StringFormat();
		String str = sf.getString();
		
		IndexOperator i = new IndexOperator();
	    int index = i.index(str);
		

		Number f = new Number();
		boolean vaiidRimFormat = f.flag(str);
	    
	    Result r  = new Result();
	    int result = r.result(str, index);
	   
	    if(vaiidRimFormat == true) {
	    Romatic a = new Romatic();
	   
	    String s = a.convert(result);
		System.out.println( "вы ввели римские  цифры ваш ответ " + s);
	    }else {
		System.out.println("вы ввели арабские цифры ваш ответ " + result);
	    }
	    }catch(NumberFormatException | IllegalStateException e) {
	    	System.out.println("вы ввели не коректное значение ");			
	    }
	}
	// p.s зарание извеняюсь за нейминги и код в целом

}
