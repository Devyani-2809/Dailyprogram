//43. Remove duplicate characters from a string.
import java.util.Scanner;
public class RemoveDupliChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

String result="";
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	boolean found=false;
	for(int j=0;j<result.length();j++)
	{
		if(result.charAt(j)==ch)
		{
			found=true;
			break;
		}
	}
	if(!found)
	{
		result=result+ch;
	}
}
System.out.println("Remove duplicate characters from a string:"+result);
}
}