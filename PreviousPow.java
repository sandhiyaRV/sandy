
public class PreviousPow {
public static void main(String[] args) {
	
	int num=122334;
	StringBuffer sb1=new StringBuffer("122334");
	sb1.reverse();
	String s1=sb1.toString();
	int n=Integer.parseInt(s1);
	System.out.println(n);
	int res=0;
	while(n!=0)
	{
		int a=n%10;
		n=n/10;
		int b=n%10;
		System.out.println(b);
		res=res+(int)Math.pow(a,b);
	}
	System.out.println(res);
}
}
