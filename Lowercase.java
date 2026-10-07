//26. Check whether a string contains only lowercase letters
import java.util.Scanner;
public class Lowercase
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
if(ch<96 || ch>126) 
{
alpha=false;
break;
}
}
if(alpha)
{
	System.out.println("String contains lowercase letters");
}
else
{
	System.out.println("String doesnot contains only lowercase letters");
}
}
}