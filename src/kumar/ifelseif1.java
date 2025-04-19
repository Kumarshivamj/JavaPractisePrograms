package kumar;

import java.util.Scanner;

public class ifelseif1 {


		public static void main(String[] args) {
			System.out.println("Enter the number 1 : ");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				System.out.println("Enter the number 2 : ");
				int b = sc.nextInt();
				System.out.println("Enter the number 3 : ");
				int c = sc.nextInt();
				System.out.println("Enter the number 4 : ");
				int d = sc.nextInt();
				
				if(a>b && a>c && a>d) {
					System.out.println(a  + " A is the largest number");
				}
				
				else if(b>c && b>d) { 
					System.out.println(b  + " B is largest number");
			}
				else if(c>d) {
					System.out.println(c + " C is greater number");
				}
			
			else {
				System.out.println(d  + " D is greater");
			}
				
		}

	}


