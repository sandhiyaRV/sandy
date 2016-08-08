

import java.util.Scanner;

public class Prefix
{
public static void main(String[] args) 
{
		Scanner sn=new Scanner(System.in);
	   System.out.println("Enter the first string : ");
	String s1 = sn.nextLine();

	System.out.println("Enter the second string : ");
	String s2 = sn.nextLine();

	if (s1.charAt(0) != s2.charAt(0)) {
	  System.out.println(""+s1+ " and "+s2+ " have no common prefix");
	  System.exit(0);
	    }

	for(int i=0;i<s1.length()-1;i++){
		if(s1.charAt(i)==s2.charAt(i)){
			System.out.print(s1.charAt(i));
		}
	}
	sn.close();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



