//23. Check whether a string contains only digits
import java.util.Scanner;
public class Digits
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean digit=true;
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch<'0' || ch>'9')
	{
		digit=false;
		break;
	}
}
if(digit)
{
System.out.println("String contains only digits");
}
else
{
	System.out.println("String doesnot contains only digits");
}
}
}