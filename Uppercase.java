//25. Check whether a string contains only uppercase letters.
import java.util.Scanner;
public class Uppercase
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
if(ch<65 || ch>90) 
{
alpha=false;
break;
}
}
if(alpha)
{
	System.out.println("String contains uppercase letters");
}
else
{
	System.out.println("String doesnot contains only uppercase letters");
}
}
}