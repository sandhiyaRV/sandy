import java.util.Scanner;

class Reverse {
class PrimeNo
	public static void main(String[] args) {
		int flag = 0;
		int count = 0;
		int i;
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the range");
		int n = sn.nextInt();
		for (i = 2; i < n; i++) {
			flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				count++;

				System.out.println("count is" +count +"  "+ "no is"  +i );
				
			} 
		}
	}
}
