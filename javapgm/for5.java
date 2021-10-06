class For
{
 public static void main(String ar[])
  {
    int x=1;
	int x1=5;
	int i,j;
	{                     
	  for(i=1;i<=4;i++)
	   {
	     for(j=1;j<=5;j++)
		   {
			   if(i%2==1)
			   {
			     System.out.print(x+" ");
			      x++;
			   }
			    else
				{
					System.out.print(x1+" ");
					x1--;
				  }
		          }
				   x=1;
				  x1=5;
				  System.out.println();
	   }
	}
  }
}  
			