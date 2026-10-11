/*
Q9. Write a java program to print this pattern.        
           *            
        *  *  *       
     *  *  *  *  *    
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *   
*/
public class P9
{
	public static void main(String[] args)
	{
		for( int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
			if(j<=5-i||j>5+i-1)
				 {
				System.out.print("  ");	 
				 }
			else
			{
			System.out.print("* ");	 	
			}
		}
			 System.out.println();	
			}
		}
	}	