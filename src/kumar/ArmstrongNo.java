package kumar;

public class ArmstrongNo {

	public static int countDigits(int n) {
		int count = 0;
		while(n!=0)
		{
			   count++;
			   n = n/10;
		}
		System.out.println("count" + count);
		return count;
		

	}
	public static int xPowerN(int x,int n){
		
		int res = 1;
		for(int i=1; i<=n; i++)
		{
			res = res*x;
		}
             return res;
	}
   public static void main(String[] args)
   {
	   int num =11;
	   int temp = num;
	   int sum = 0;
	   int count = countDigits(num);
	   while (num!=0)
	   {
		   int id = num %10;
		   sum = sum + xPowerN(id,count);
		   num = num / 10;
	   }
	   if(temp == sum) {
	   System.out.println(temp +" : no is  Armstrong");
	   }
	   else {
	   System.out.println(temp + " : the no is Not Armstrong");
	   }
	   
}
}
