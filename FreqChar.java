//35. Find the frequency of every character in a string.
import java.util.Scanner;
public class FreqChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

int freq[]=new int[256];
for(int i=0;i<s.length();i++)
{
	freq[s.charAt(i)]++;
}
for(int i=0;i<256;i++)
{
	if(freq[i]>0)
	{
		System.out.println((char)i+"="+freq[i]);
	}
}
}
}