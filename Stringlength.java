//2. Find the length of a string without using `length()`.
import java.util.Scanner;
public class Stringlength
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
char a[]=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++)
{
	count++;
}
System.out.println("Length of String:"+count);
}
}