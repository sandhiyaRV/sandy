import java.util.Scanner;

public class Pow {
	static int output1;

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the num : ");
		int num = sn.nextInt();
		String s1 = "" + num;
		int pow = s1.length();
		int res = 1;
		int sum = 0;
		int res1=0;
		System.out.println(pow);
		while (num != 0) {
			res=1;
			int a = num % 10;
			for (int j = 1; j <=pow; j++) {
			res=a*res;
			}
			res1+=res;
			System.out.println(res1);
			num = num / 10;
		}
	}
}
