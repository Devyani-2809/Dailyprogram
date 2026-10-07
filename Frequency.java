//35. Find the frequency of every character in a string.
import java.util.Scanner;
public class Frequency
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

for(int i=0;i<s.length();i++)
{
	int count=1;
	int j;
	for( j=i+1;j<s.length();j++)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
		}
	}
System.out.println(s.charAt(i)+"="+count);
}
}
}