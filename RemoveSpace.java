//14. Remove all white spaces from a string.
import java.util.Scanner;
public class RemoveSpace
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
String result=" ";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ')
	{
		result=result+s.charAt(i);
	}
}
System.out.println(result);
}
}