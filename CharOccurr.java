/*
11. Count the occurrences of a particular character.
12. Find the first occurrence of a character.
13. Find the last occurrence of a character.
14. Remove all white spaces from a string.
15. Count the number of words in a sentence.
16. Find the ASCII value of each character.
17. Replace all spaces with hyphens.
18. Compare two strings without using `equals()`.
19. Check whether two strings are equal.
20. Concatenate two strings without using `concat()`.
*/
import java.util.Scanner;
public class CharOccurr
{
public static void main (String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

System.out.println("enter the character");
char ch=xyz.next().charAt(0);
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==ch)
{
count++;
}
}
System.out.println("the occurrences of particular " + ch + " :"+count);
}
}