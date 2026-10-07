public class Palindrome
{
public static void main(String[] args)
{
int n=121;
int rev=0;
int original=0;
while(n>0)
{
int digit=n%10;
rev=rev*10+digit;
n=n/10;
}
System.out.println("Reverse:"+rev);
if(rev==original)
{
System.out.println("palindrome");
}
	if(rev/3==0 && rev/5==0)
	{
	System.out.println("divisible by 3 and 5");
	}
else
{
	System.out.println("not divisible by 3 and 5");
}
}
}



