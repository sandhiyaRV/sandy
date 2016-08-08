import java.util.Scanner;


public class Pyramid {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter the num : ");
	int n=sn.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
