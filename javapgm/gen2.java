class Gen <T1,T2>
   {
      T1 name;
	  T2 value;
	  Gen(T1 o1,T2 o2)
	    name = o1;
		value = o2;
		}
		
public T1 getName()
   {
      return name;
	  }
	  public T2 getValue()
	   {
	     return value;
		 }
		 }

Class Demo
  {
    public static void main(String args[])
	   {
	     Gen<String,Integer> badu = new gen<>("Bharath",21421);
		 String s = badu.getName();
		 System.out.println(s);
		 Integer i = badu.getValue();
		 System.out.println(i);
		 }
		 }
	  