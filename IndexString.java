//73. Implement your own version of `String.indexOf()`.
import java.util.Scanner;
public class IndexString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the string");
String s=xyz.nextLine();
System.out.println("enter the subString");
String sub=xyz.nextLine();
int pos=-1;
for(int i=0;i<=s.length()-sub.length();i++)
{
int j=0;
for(j=0;j<sub.length();j++)
{
if(s.charAt(i+j)!=sub.charAt(j))
{
	break;
}
}
if(j==sub.length())
{
	pos=i;
	break;
}
}
	System.out.println("Index:"+pos);
}
}