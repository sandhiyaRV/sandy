public class CyclicSum {
public static void main(String[] args) {
	int num=1234;
	int count=0;
	int rev=0;
	int num1=num;
	while(num1>0)
	{
		num1=num1/10;
		count++;
		
	}
	
	System.out.println(count);
	int count1=1;
	for(int i=0;num>0;i++)
	{ 
		int a=num%10;
		num=num/10;
		rev+=(a*count1);
		count1++;
		System.out.println(rev);	
	 }
   }
}
