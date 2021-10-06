class Main
  {
    public static void main(String args[])
	   {
	     StringBuffer sb = new StringBuffer();
		   System.out.println(sb.capacity());
		   
		   sb.append("Hello");
		   System.out.println(sb.capacity());
		   
		   sb.append("Bharath is a java applicant");
		   System.out.println(sb.capacity());
		   
		   sb.ensureCapacity(15);
		   System.out.println(sb.capacity());
		   
		   sb.ensureCapacity(50);
		   System.out.println(sb.capacity());
		   }
		   }