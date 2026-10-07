//45. Find the minimum occurring character.
import java.util.Scanner;
public class MinOccurrChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean found=false;
int min=s.length()+1;
char minchar=' ';
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
			if(count<min)
			{
		    min=count;
		   minchar=s.charAt(i);
			}
}
System.out.println("Minimum occurring character:"+minchar);
}
}



