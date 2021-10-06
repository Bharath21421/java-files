import java.util.ArrayList;
import java.util.Iterator;
 
    class Main
	  {
	    public static void main(String args[])
		int i;
		   {
		      ArrayList<Integers> cars = new ArrayList<Integers>();
			  
			     cars.add(767391);
				 cars.add(19);
				 cars.add(7279);
				  
				Iterator<Integers> it = cars.iterator();
				
				 while(it.hasNext())
				 {
					 Integer i = it.next();
					 if(i<20)
					 {
						 it.remove();
					 }
				 }
				
				System.out.println(cars);
				}
				}
	  
	  
				