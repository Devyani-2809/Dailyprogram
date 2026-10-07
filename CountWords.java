//15. Count the number of words in a sentence.
import java.util.Scanner;
public class CountWords
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
String result=" ";
int count=1;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==' ')
	{
	count++;
	}
}
	System.out.println("the number of words in a sentence:"+count);
}
}