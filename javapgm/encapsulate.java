class Encapsulate
   {
      private String geekName;
	  private int geekRoll;
	  private int geekAge;
	     
		   public int getAge()
		   {
		     return geekAge;
			 }
			 public int getRoll()
			 {
			   return geekRoll;
			   }
			   public String getName()
			   {
			     return geekName;
				 }
				 public void setName(String newName)
				 {
				    geekName = newName;
					}
				 public void setRoll(int newRoll)
				 {
				    geekRoll = newRoll;
					}
					public void setAge(int newAge)
					{
					  geekAge = newAge;
					  }
					  }
					  
class Main
       {
	      public static void main(String args[])
		  {
		     Encapsulate obj = new Encapsulate();
			 
			 obj.setName("Bharath");
			 obj.setRoll(39);
			 obj.setAge(21);
			 
			 System.out.println("Geeks name: " + obj.getName());
			 System.out.println("Geeks roll: " + obj.getRoll());
			 System.out.println("Geeks age: " + obj.getAge());
			 }
			 }