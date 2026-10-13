//3. Count the number of vowels in a string.
import java.util.Scanner;
public class CountVowels
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String:");
String s=xyz.nextLine();
char a[]=s.toCharArray();
int count=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
	{
		count++;
	}
}
System.out.println("Count of Vowels:"+count);
}
}