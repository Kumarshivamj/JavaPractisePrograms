package kumar;
//import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		int myNum = 5;
		String website ="Rahul shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum);
		System.out.println(website);
		System.out.println(dec);
		System.out.println(myCard);
		System.out.println(letter);
		//Arrays
		int[] arr= new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=8;
		
		int[] arr2= {1,2,4,5,6,9,7,8};
		System.out.println("the array is:" + arr2[2]);
		
		//foe loop arr.length =5
		for(int i = 0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
	}
		for(int i=0; i<arr2.length; i++)
		{
	System.out.println(arr2[i]);
		}
		String[] name = {"kumar","shivam","selenium"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		//advanced for -loop
		for (String s: name)
		{
			System.out.println(s);
		}
		}
}
