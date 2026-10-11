/*
Q35. Write a java program to print this pattern.   
5 4 3 2 1   
  4 3 2 1    
    3 2 1      
	  2 1       
	    1 
*/
public class NoP35
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
          System.out.print(" ");
			}		  
		     for(int k=i;k>=1;k--)
			 {
				System.out.print(k+" ");	
			}
              System.out.println();				
		}
	}
}