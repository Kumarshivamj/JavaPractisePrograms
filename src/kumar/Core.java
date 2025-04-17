package kumar;
import java.util.Scanner;
public class Core {

	public static void main(String[] args) { 
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		a = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		b = sc.nextInt();
		System.out.println("Sum is : ");
		add(a,b); //comment
	}
	public static void add(int a, int b)
	{
		int sum = (a+b);
		System.out.println(sum); //commit
		
	}
}
	 
 



