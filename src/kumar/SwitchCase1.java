package kumar;
import java.util.Scanner;
public class SwitchCase1 {

	public static void main(String[] args) {
	System.out.println();	
	System.out.println("Menu : ");
	System.out.println("1 : Dosa ");
	System.out.println("2 : Idli ");
	System.out.println("3 : Sambhar ");
	System.out.println("4 : Chutney ");
	System.out.println("Choose any one Option :  ");
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	
	switch(option) 
	{
	
		case 1: {
			System.out.println("Dosa Selected");
		} break;
		
		case 2:{
			System.out.println("Idli Selected");
		} break;
		
		case 3:{
			System.out.println("Sambhar Selected");
		} break;
		case 4:{
			System.out.println("Chutney Selected");
		}break;
		
		default: {
			System.out.println("Invalid Option !!!!");
		
			
		}
	}
  }
}
