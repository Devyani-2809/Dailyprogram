//18. Compare two strings without using `equals()`.
import java.util.Scanner;
public class CompareString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String1");
String s1=xyz.nextLine();
System.out.println("enter the String2");
String s2=xyz.nextLine();
int flag=1;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)!=s2.charAt(i))
{
	flag=0;
	break;
}
}
if(flag==1)
{
System.out.println("Strings are equal");
}
else
{
System.out.println("Strings arenot  equal");
}
}
}