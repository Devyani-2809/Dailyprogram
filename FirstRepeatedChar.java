//42. Find the first repeated character.
import java.util.Scanner;
public class FirstRepeatedChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean found=false;

for(int i=0;i<s.length();i++)
{
int count=0;

for(int j=0;j<s.length();j++)
{
	if(s.charAt(i)==s.charAt(j))
	{
		count++;
	}
}

if(count>1)
{
	System.out.println("first Repeated character:"+s.charAt(i));
	found=true;
	break;
}
}
if(!found)
{
	System.out.println("no repeated character");
}
}
}