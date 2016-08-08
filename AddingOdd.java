public class AddingOdd {
	public static void main(String[] args) {
		int i = 2156348;
		int x;
		int Even = 0, Odd = 0;

		while (i != 0) {
			x = i % 10;
			if (x % 2 != 0) {

				Odd = Odd + x;
			}
			i = i / 10;

		}
		System.out.println("Sum of ODD NO :" + Odd);
	if(Odd%2==0)
	{
		System.out.println("-1");
	}
	else
	{
		System.out.println("1");
	}
}
}
