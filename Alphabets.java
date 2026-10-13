//24. Check whether a string contains only alphabets.
import java.util.Scanner;
public class Alphabets
{
public static void main(String[] args)
{
Scanner xyz=new  Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean alpha=true;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if((ch<'a' && ch>'z') || (ch<'A' && ch>'Z'))
{
alpha=false;
break;
}
}
if(alpha)
{
	System.out.println("String contains only alphabets");
}
else
{
	System.out.println("String doesnot contains only alphabets");
}
}
}