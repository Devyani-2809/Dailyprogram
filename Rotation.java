//52. Check whether one string is a rotation of another.
import java.util.Scanner;
public class Rotation
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String1");
String s1=xyz.nextLine();
System.out.println("enter the String2");
String s2=xyz.nextLine();
if(s1.length()==s2.length())
{
	System.out.println("Rotation");
	return;
}
boolean rotation=false;
for(int i=0;i<s1.length();i++)
{
	String rotated=s1.substring(i)+s1.substring(0,i);
	if(rotated.equals(s2))
	{
		 rotation=true;
		break;
	}
}
if(rotation)
{
	System.out.println("Rotation");
}
else
{
	System.out.println("Not Rotation");
}	
}
}