//62. Find the number of occurrences of a substring.
import java.util.Scanner;
public class OccSubString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

System.out.println("enter the sub String");
String sub=xyz.nextLine();

int count=0;
for(int i=0;i<=s.length()-sub.length();i++)
{
	boolean found=true;
for(int j=0;j<sub.length();j++)
{
	if(s.charAt(i+j)!=sub.charAt(j))
	{
		found=false;
		break;
	}
}
	if(found)
	{
		count++;
	}
}
System.out.println("the number of occurrences of a substring:"+count);
}
}