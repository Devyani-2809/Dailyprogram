/*Programming Question 
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
public class NonRepeated
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	int count=0;
for(int j=0;j<s.length();j++)
{
	if(ch==s.charAt(j))
	{
	count++;
}
}
if(count==1)
{
	System.out.println("the first non-repeated character:"+ch);
	return;
}
}
	System.out.println("all repeated character");
}
}