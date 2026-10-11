//32. Count uppercase and lowercase letters separately.
import java.util.Scanner;
public class CountUpperLower
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
int uppercount=0;
int lowercount=0;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch>='A' && ch<='Z')
{
uppercount++;
}
if(ch>='a' && ch<='z')
{
lowercount++;
}
}
System.out.println("Count of Uppercase:"+uppercount);
System.out.println("Count of Lowercase:"+lowercount);
}
}
