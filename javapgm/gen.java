class Gen <T>
  {
     T ob;   //create an object for gen
	 Gen(T o)  // constructor
	  {
	    ob = o;
		}
		public T getob()
		    {
			   return ob;
			   }
			   }
			   
class Demo
     {
	   public static void main(String args[])
	     {
		    Gen<Integer> iob= new Gen<>(100);
			int x = iob.getob();
			System.out.println(x);
			Gen<String> sob= new Gen<>("Bharath");
			String v = sob.getob();
			System.out.println(v);
			}
			}