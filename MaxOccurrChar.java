//44. Find the maximum occurring character.
import java.util.Scanner;
public class MaxOccurrChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean found=false;
int max=0;
char maxchar=' ';
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
			if(count>max)
			{
		    max=count;
		   maxchar=s.charAt(i);
			}
}
System.out.println("Maximum occurring character:"+maxchar);
}
}



