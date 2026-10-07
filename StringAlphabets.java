//24. Check whether a string contains only alphabets
import java.util.Scanner;
public class StringAlphabets
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
	
	if(!(ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	{
		flag=false;
		break;
	}
}
if(flag)
{
	System.out.println("string contains only Alphabets");
}
else
{
	System.out.println("String is not contains only Alphabets");
}
}
}