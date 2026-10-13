//46. Count the frequency of each word in a sentence
import java.util.Scanner;
public class WordFreqCount
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

String words[]=s.split(" ");
for(int i=0;i<words.length;i++)
{	
	int count=0;
	boolean found=false;
	
	for(int k=0;k<i;k++)
	{
		if(words[i].equals(words[k]))
		{
			found=true;
			break;
		}
	}
	if(found)
	continue;

for(int j=0;j<words.length;j++)
{
	if(words[i].equals(words[j]))
	{
		count++;
	}
}

System.out.println(words[i]+"="+count);
}
}
}