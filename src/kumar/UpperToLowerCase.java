package kumar;

public class UpperToLowerCase {

	public static void main(String[] args) {
		        String input = "ABC"; 
		        String output = ""; 
		        for(int i =0; i<input.length(); i++) {
		            System.out.println("Loop for i = " + i);
		            //We will save value of string at i position in ch
		            char ch = input.charAt(i);
		            System.out.println("Character assigned to ch = " + ch);
		            // We will check ih ch is in range A to Z
		            if(ch >= 'A' && ch <= 'Z') {
		                ch = (char) (ch + 32);
		                System.out.println(ch); // print value of ch
		            }
		            output = output + ch;
		             System.out.println("ch + output - "+output.toString());
		        }
		        System.out.print("Final output -" + output.toString());
		    }
		
	}


