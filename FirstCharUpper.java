//34. Convert the first character to uppercase.
import java.util.Scanner;
public class FirstCharUpper
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String:");
String s=xyz.nextLine();
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(i==0)
	{
System.out.print("the first character to uppercase:"+Character.toUpperCase(ch));
	}
	else
	{
		System.out.print(ch);
	}
}
}
}