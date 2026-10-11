//34. Convert the first character to uppercase.
import java.util.Scanner;
public class Firstchartouppercase
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

if(s.length()==0)
{
	System.out.println("String is empty");
	return;
}
char ch=s.charAt(0);
if(ch>='a' && ch <='z')
 {
  ch=(char)(ch-32);
 }
 System.out.print(ch);
 for(int i=1;i<s.length();i++)
 {
	 System.out.print(s.charAt(i));
 }
 }
}