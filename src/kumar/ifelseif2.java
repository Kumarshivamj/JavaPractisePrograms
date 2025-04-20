package kumar;
import java.util.Scanner;

public class ifelseif2 {

	
		public static void main(String[] args) {
			   System.out.println("Enter the Percentage : ");
			   Scanner sc = new Scanner(System.in);
			   double perc= sc.nextDouble();
			   
			   if(perc >= 85.0 && perc <= 100.0)
			   {
			   System.out.println("Result ==> Distinction");
			   }
			   else if(perc >= 70.0 && perc <= 85.0) {
				   System.out.println("Result ==> First Class");
			   }
			   else if(perc >=50.0 && perc <=70.0) {
				   System.out.println("Result ==> Second class");
				   
			   }
			   else if(perc >= 35.0 && perc <= 50.0) {
				   System.out.println("Result ==> Fail");
			   }
			   else {
				   System.out.println("inavlid percentage: please enter a valid percentage");
			   }
			}
		
	}