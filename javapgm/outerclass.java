class OuterClass
   {
      int x = 3;
	  
class InnerClass
    {
	   int Y = 7;
	   }
   }
	   
class Main
    {
	   public static void main(String args[])
	     {
		    OuterClass myOuter = new OuterClass();
			OuterClass.InnerClass myInner = myOuter.new InnerClass();
			
			  System.out.println(myInner.Y + myOuter.x);
			  }
			  }
			 