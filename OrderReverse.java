//37. Reverse the order of words in a sentence.
import java.util.Scanner;
public class OrderReverse
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

String space="";
for(int i=s.length()-1;i>=0;i--)
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