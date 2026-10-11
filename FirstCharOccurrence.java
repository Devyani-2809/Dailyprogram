//12. Find the first occurrence of a character.
import java.util.Scanner;
public class FirstCharOccurrence
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the String");
		String s=xyz.nextLine();
		System.out.println("enter the character");
		char ch=xyz.next().charAt(0);
		int index=-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				index=i;
				break;
			}
		}
		if(index!=-1)
		{
		System.out.println("First occurrence "+ ch +" character of index :"+index);
		}
		else
		{
		System.out.println(" character not found");
		}
	}
}