import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

     class Main
	      {
		      public static void main(String args[])
			      { 
				      ListIterator<String> it = null;
					  ArrayList<String> badu = new ArrayList<String>();
					  
					     badu.add("Bharath");
						 badu.add("Harshini");
						 badu.add("Harsha");
						 badu.add("victor");
						 
						 it = badu.listIterator();
						 
						 System.out.println("Forward direction:");
						  while(it.hasNext())
						  {
						     System.out.println(it.next());	
							 }
							 System.out.println("\nBackward direction:");
							 while(it.hasPrevious())
							  {
							     System.out.println(it.previous());
								 }
								 }
		  }
						 