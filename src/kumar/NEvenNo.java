package kumar;
import java.util.Scanner;
public class NEvenNo {

		public static void main(String[] args) {
			System.out.println("Enter the number : ");
			  Scanner sc = new Scanner(System.in);
			  int n = sc.nextInt();
			  int i =1;
			  while(i<=n) {
				  if(i%2==0) {
					  System.out.println(i + " is Even");
				  }
					  else {
						  System.out.println(i + " is odd");
						  
					  }
					  i++;
				  }
			  }
		
	}
