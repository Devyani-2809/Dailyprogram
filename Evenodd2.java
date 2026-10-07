public class Evenodd2
{
public static void main(String args[])
{
	int n=58327;
int largest=0;
int smallest=9;
int sum=0;
int evencount=0;
int oddcount=0;

while(n>0)
{
	int digit=n/10;
	sum=sum+digit;
	
	if(digit>largest)
	{
		largest=digit;
	}
	if(digit<smallest)
	{
		smallest=digit;
	}
	if(digit%2==0)
	{
		evencount++;
	}
	else
	{
		oddcount++;
	}
	n=n%10;
}
System.out.println("Largest digit="+largest);
System.out.println("smallest digit="+smallest);
System.out.println("sum of digits="+sum);
System.out.println("count of even="+evencount);
System.out.println("odd digits="+oddcount);	
}
}