//64. Check whether a string starts with a given prefix.
import java.util.Scanner;
public class PrefixString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
System.out.println("enter the Prefix String");
String prefix=xyz.nextLine();
if(prefix.length()>=s.length())
{
System.out.println("does not tring starts with a given prefix");
}
boolean flag=true;
for(int i=0;i<prefix.length();i++)
{
if(s.charAt(i)!=prefix.charAt(i))
{
flag =false;
break;
}
}
if(flag)
{
	System.out.println("string starts with prefix");
}
else
{
	System.out.println("does not string starts with prefix");
}
}
}