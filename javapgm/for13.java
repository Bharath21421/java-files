class For
 {
   public static void main(String ar[])
    {
	  int i,j;
	  for(i=1;i<5;i++)
	  {
		  for(j=1;j<8;j++)
		  {
			  if(j>=6-i && j<=i+2)
			  {
				  System.out.print(" ");
			  }
		  
			   else
			   {
				   System.out.print("*");
			   }
		  }  
			   System.out.println();
		  }
	  
	  
	  
	   for(i=1;i<5;i++)
	    {
		  for(j=1;j<8;j++)
		   {
		     if(j<=7-i && j>=i+1)
			  {
			    System.out.print(" ");
				}
				 else
				 {
				  System.out.print("*");
				  }
		   }
				  System.out.println();
		}
	}
 }