package kumar;
import java.util.Scanner;
public class Factorial {

	public static int factorial(int n) 
	{
		int fact=1;
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

	public static void main(String[]args)
	{
		System.out.println(" Enter a Number: ");
		Scanner Sc=new Scanner(System.in);
						
		int num=Sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int ld=num % 10;
			sum=sum+ factorial(ld);
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println(temp+" is strong Number");
		else
			System.out.println(temp+" is not a strong Number");
	}	
}
