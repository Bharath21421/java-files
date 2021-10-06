class For
{ 
  public static void main(String ar[])
   {
     int i,j,k;
	 int temp=0;
	 int temp1=5;
	 
	   for(i=1;i<4;i++)
	    { 
		  for(j=1;j<=temp;j++)
		  {
		    System.out.print(" ");
			}
			  temp++;
			  {
			    for(k=1;k<=temp1;k++)
				{
				  System.out.print("*");
				  }
				  }
				  temp1=temp1-2;
				  System.out.println();
		}
   }
}