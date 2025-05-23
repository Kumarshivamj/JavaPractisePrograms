package kumar;

public class UpperCaseToLowerString {

		public static void main(String[] args) {
			 String st = "I Am Kumar";
			 st = st.toLowerCase();// to Lowercase method and for upper --> toUpperCase();
			 System.out.println(st);
			 for(int i=0; i<st.length(); i++) {
				 if(st.charAt(i)> 64 && st.charAt(i)< 92 ) {
					 System.out.print((char)(st.charAt(i)+ 32)); 	 
				 }
				 else {
					 System.out.print(st.charAt(i));
				 }
				
					 
				 }
				 
			 }

			

	}


