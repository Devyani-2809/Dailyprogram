/*
Q33. Write a java program to print this pattern.   
1 2 3 4 5  
2 3 4 5 6  
3 4 5 6 7  
4 5 6 7 8  
5 6 7 8 9 
*/
public class NoP33
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i=i+1)
		{
		  for(int j=i;j<i+5;j++)
		{	
		System.out.print(j+" ");
		}
		System.out.println();
		}
	}
}