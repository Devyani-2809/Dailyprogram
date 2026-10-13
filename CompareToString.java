//72. Implement your own version of `String.compareTo()`.
import java.util.Scanner;
public class CompareToString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the string1");
String s1=xyz.nextLine();
System.out.println("enter the string2");
String s2=xyz.nextLine();
int min;
if(s1.length()<s2.length())
{
min=s1.length();
}
else
{
min=s2.length();
}
int result=0;
for(int i=0;i<min;i++)
{
if(s1.charAt(i)!=s2.charAt(i))
{
	result=(int)s1.charAt(i)-(int)s2.charAt(i);
	break;
}
}
if(result==0)
{
 System.out.println(s1.length()-s2.length());
}
else
{
	System.out.println(result);
}
}
}