package kumar;

import java.util.Scanner;
public class SumOfNNaturalNo {


		//program to print n natural number using scanner class
		public static void main(String[] args) {
			System.out.println("Enter the number : ");
			  Scanner sc = new Scanner(System.in);
			  int n = sc.nextInt();
			int sum = 0;
			int i = 1;
			while(i<=n) {
				sum= sum +i;
				i++;
					
				}
			System.out.println("Sum is : " + sum);
			}
	


	}


