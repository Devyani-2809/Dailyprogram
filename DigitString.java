/*
23. Check whether a string contains only digits.
*/
import java.util.Scanner;
public class DigitString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

boolean flag=true;

for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	
	if(ch<'0' || ch>'9')
	{
		flag=false;
		break;
	}
}
if(flag)
{
	System.out.println("string contains only digits");
}
else
{
	System.out.println("String is not contains only digits");
}
}
}
		