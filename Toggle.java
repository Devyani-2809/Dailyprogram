//33. Toggle the case of each character.
import java.util.Scanner;
public class Toggle
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch>='a' && ch <='z')
 {
	 ch=(char)(ch-32);
 }
 else if(ch>='A' && ch <='Z')
 {
	ch=(char)(ch+32); 
 }
System.out.print(ch);
}
}
}