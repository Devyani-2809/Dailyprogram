/*
41. Find the first non-repeated character.
42. Find the first repeated character.
43. Remove duplicate characters from a string.
44. Find the maximum occurring character.
45. Find the minimum occurring character.
46. Count the frequency of each word in a sentence.
47. Sort characters in a string alphabetically.
48. Sort words in a sentence alphabetically.
49. Count the number of sentences in a paragraph.
50. Find the longest word in a sentence.
*/
//41. Find the first non-repeated character.
import java.util.Scanner;
public class NonRepeatedChar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
boolean found=false;

for(int i=0;i<s.length();i++)
{
int count=0;

for(int j=0;j<s.length();j++)
{
	if(s.charAt(i)==s.charAt(j))
	{
		count++;
	}
}

if(count==1)
{
	System.out.println("first non-repeated character:"+s.charAt(i));
	found=true;
	break;
}
}
if(!found)
{
	System.out.println("no non-repeated character");
}
}
}