public class Number
{
public static void main(String[] args)
{
int a[]={10,6,-9,0,7,0,-2};
      int pcount=0;
	  int ncount=0;
	  int zcount=0;
	  int largepno=0;
	  int smallnno=0;
	  boolean haspositive=false;
	 boolean hasnegative=false;
  for(int i=0;i<a.length;i++)
  {
	 
	  if(a[i]>0)
	  {
		  pcount++;
		  if(!haspositive || a[i]>largepno)
			  largepno=a[i];
		 haspositive=true;
	  } 
	  else if(a[i]<0)
		 {
			 ncount++;
			 if(!hasnegative || a[i]<smallnno)
			  smallnno=a[i];
		      hasnegative=true;	 
		 }	 
	  else
	  {
		 zcount++; 
		 }
  }
		 System.out.println("positive no count:"+pcount);
	     System.out.println("Zero no count:"+zcount);
		 System.out.println("Negative no count:"+ncount);
		 
		 if(haspositive)
		 {
			 System.out.println("Largest positive number: "+largepno);
     }
    else
	{
		System.out.println("no positive number:");
    }
	if(hasnegative)
	{
		System.out.println("smallest negative number: "+smallnno);
     }
    else
	{
		System.out.println("no negative number:");
    }
}
}