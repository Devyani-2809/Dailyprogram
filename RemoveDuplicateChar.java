//43. Remove duplicate characters from a string.
import java.util.Scanner;
public class RemoveDuplicateChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
String result=" ";
for(int i=0;i<s.length();i++)
{
	boolean duplicate=false;
char ch=s.charAt(i);
for(int j=0;j<i;j++)
{
if(s.charAt(i)==s.charAt(j))
{
duplicate=true;
break;
}
}
if(!duplicate)
{
result=result+s.charAt(i);
}
}
System.out.println(result);
}
}