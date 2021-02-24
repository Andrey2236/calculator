package call;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexOperator {

	public static int index(String str) {
		 Pattern p = Pattern.compile("[-|+|*|/]");
		   Matcher m = p.matcher(str);
		   boolean s = m.find();
		   int index = m.start();

			
			return index;
	}
}
