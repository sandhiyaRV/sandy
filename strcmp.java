import java.util.Scanner;

public class Strcmp {

	public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the String1 : ");
		String s1 = sn.nextLine();
		System.out.println("Enter the String2 : ");
		String s2 = sn.nextLine();
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("same");
		}
		else{
			System.out.println("not same");
		}
	}

}
