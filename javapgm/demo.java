class Demo
  {
     public static void main(String args[])
	   {
	      try
		    {
			  Integer badu = new Integer("abv");
			    badu.intValue();
				}
				catch (ArithmeticException e)
				{
				  System.out.println("ArithmeticException " + e);
				    }
					 catch (NumberFormatException e)
					   { 
					      System.out.println("Number system " + e);
						  }
						  }
  }