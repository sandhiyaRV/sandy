import java.util.Scanner;


public class IsSumPalindrome {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter the number : ");
	int number=sn.nextInt();
	int sum=0;
	int n=number;
	while(number!=0)
	{
	int a=number%10;
	number/=10;
	sum+=a;
	}
	System.out.println(sum);
	
	if(sum==n)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
