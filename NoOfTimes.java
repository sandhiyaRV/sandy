import java.util.Scanner;
class NoOfTimes
{
public static void main(String args[])
{
Scanner sn=new Scanner(System.in);
		System.out.println("enter the number");
		int count=0;
		int num=sn.nextInt();
		int a[]=new int[100];
		int check=7;
		for(int i=0;i<num;i++)
		{
			int b=num%10;
			num=num/10;
		     a[i]=b;
		     if(a[i]==check)
		     {
		    	 count++;
		     }
		     }
		     }
		     }
