package call;

public class Romatic {

	
		   public static String convert(int in) {
		        StringBuffer a = new StringBuffer("");
		      
		        int m1 = in / 1000;
		        a.append(M(m1));
		       
		        int m2 = in % 1000;

		     
		        int d1 = m2 / 500;
		        a.append(D(d1));
		       
		        int d2 = m2 % 500;

		        int c1 = d2 / 100;
		        a.append(C(c1));
		       		
		        int c2 = d2 % 100;

		        
		        int l1 = c2 / 50;
		        a.append(L(l1));
		 
		        int l2 = c2 % 50;

		        
		        int x1 = l2 / 10;
		        a.append(X(x1));
		        
		        int x2 = l2 % 10;

		        
		        a.append(basic(x2));
		        return a.toString();
		    }

		    
		    private static String M(int in) {
		        StringBuffer a = new StringBuffer("");
		        int i = 0;
		        while (i < in) {
		            a.append("M");
		            i++;
		        }
		        return a.toString();
		    }
		    
		    private static String C(int in) {
		        if (in == 4) return "CD"; 
		        else if ((in != 0) && (in < 4)) {
		            StringBuffer a = new StringBuffer("");
		            int i = 0;
		            while (i < in) {
		                a.append("C");
		                i++;
		            }
		            return a.toString();
		        }
		        else return "";
		    }

		// целые десятки

		    private static String X(int in) {
		        if (in == 4) return "XL"; // если 40, то 50-10
		        else if ((in != 0) && (in < 4)) {
		            StringBuffer a = new StringBuffer("");
		            int i = 0;
		            while (i < in) {
		                a.append("X");
		                i++;
		            }
		            return a.toString();
		        }
		        else return "";
		    }
		    
		     private static String D(int in) {

		        if (in == 4) return "CM";
		        else  return "";
		    }


		    private static String L(int in) {
			 if (in == 4) return "XC";
		        else if ((in != 0) && (in < 9)) {
		            StringBuffer a = new StringBuffer("");
		            int i = 0;
		            while (i < in) {
		                a.append("L");
		                i++;
		            }
		            return a.toString();
		        }
		        else return "";

		            }
		           
		            private static String basic(int in) {
		                String[] a = {
		                    "",
		                    "I",
		                    "II",
		                    "III",
		                    "IV",
		                    "V",
		                    "VI",
		                    "VII",
		                    "VIII",
		                    "IX"
		                };
		                return a[in];
		            }

		        }
