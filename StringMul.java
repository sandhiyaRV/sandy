import java.util.Scanner;
class StringMul
{
public static void main(String args[])
{
Scanner sn=new Scanner(System.in);
System.out.println("enter the num1 and num2 : ");
String s1=sn.next();
String s2=sn.next();
int num1=Integer.parseInt(s1);
int num2=Integer.parseInt(s2);
int result=num1*num2;
String result1=Integer.toString(result);
System.out.println("multiplication is : "+result1);
}
}
