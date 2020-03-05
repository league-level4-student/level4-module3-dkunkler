package _02_gotta_catchem_all;

public class ExceptionMethods {

		public static Double divide(Double a, Double b) throws Exception {
			if(b != 0.0) {
				return a/b;
			}
			else
				throw new IllegalArgumentException();
		}
		
		public static String reverse(String s) {
			String r="";
			if(s.length() == 0)
				throw new IllegalStateException();
			
			for(int i=s.length()-1; i>=0; i--) {
				r = r + s.substring(i, i+1);
			}
			return r;
		}

	}
