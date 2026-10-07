//76. Decompress a compressed string.
import java.util.Scanner;
public class CompressString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
String result="";
for(int i=0;i<s.length();i=i+2)
{
char ch=s.charAt(i);
int count=s.charAt(i+1)-'0';
for(int j=1;j<=count;j++)
{
	result=result+ch;
}
}
System.out.println("Original String:"+result);
}
}