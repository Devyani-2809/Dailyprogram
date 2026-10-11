//17. Replace all spaces with hyphens.
import java.util.Scanner;
public class ReplaceHyphens
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
String s=xyz.nextLine();
String result=" ";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==' ')
	{
	result=result+"_";
	}
	else
	{
		result=result+s.charAt(i);
	}
}
System.out.println("Replace all spaces with hyphens:"+result);
}
}	

