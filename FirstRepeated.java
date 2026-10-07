//42. Find the first repeated character.
import java.util.Scanner;
public class FirstRepeated
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
int count=0;
for(int j=0;j<s.length();j++)
{
if(ch==s.charAt(j))
{
	count++;
}
}
if(count!=1)
{
System.out.println("first repeated character:"+ch);
}
return;
}
}
}