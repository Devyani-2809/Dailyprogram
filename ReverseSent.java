//36. Reverse each word in a sentence.
import java.util.Scanner;
public class ReverseSent
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

String space="";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
 if(ch!=' ')
 {
	space=space+ch;
 }
 else
 {
	 for(int j=space.length()-1;j>=0;j--)
	 {
		 System.out.print(space.charAt(j));
	 }
	 System.out.print(" ");
	 space="";
 }
}
for(int j=space.length()-1;j>=0;j--)
	 {
		 System.out.print(space.charAt(j));
	 }
}
}