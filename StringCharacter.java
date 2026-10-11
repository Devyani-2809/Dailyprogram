/*1. Print each character of a string.
2. Find the length of a string without using `length()`.
3. Count the number of vowels in a string.
4. Count the number of consonants in a string.
5. Count the number of digits in a string.
6. Count the number of special characters in a string.
7. Convert a string to uppercase.
8. Convert a string to lowercase.
9. Reverse a string.
10. Check whether a string is a palindrome.
*/
//1. Print each character of a string.
import java.util.Scanner;
public class StringCharacter
{
public static void main(String[] args)
{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter the String:");
	String s=xyz.nextLine();
	System.out.println("Character of String:");
	for(int i=0;i<s.length();i++)
	{
	System.out.print(s.charAt(i)+" ");
	}
}
}	