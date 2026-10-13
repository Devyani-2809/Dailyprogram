//32. Count uppercase and lowercase letters separately.
import java.util.Scanner;
public class CountUpperLower1
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

int ucount=0;
int lcount=0;

for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch>='a' && ch<='z')
{
 lcount++;
}
if(ch>='A' && ch<='Z')
 {
 ucount++;
 }
 }
 System.out.println("Count of uppercase:"+ucount);
 System.out.println("Count of lowercase:"+lcount);
 }
 }