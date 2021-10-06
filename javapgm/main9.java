import java.util.regex.Pattern;
import java.util.regex.Matcher;

   class Main
       { 
	       public static void main(String args[])
		      {
			     Pattern pattern = Pattern.compile("w3 schools.com" , Pattern.CASE_INSENSITIVE);
				 Matcher matcher = pattern.matcher("Visit w3 schools.com!");
				 boolean matchFound = matcher.find();
				  if(matchFound)
				  {
				     System.out.println("Match found");
					 }
					 else
					 {
					   System.out.println("Mtch not found");
					   }
					   }
					   }