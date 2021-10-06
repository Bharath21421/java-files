import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Tables
   {
      public static void main(String args[])
	    {
		   Scanner sf = new Scanner(System.in);
            System.out.println("Enter any no");
             int no = sf.nextInt();
             int sum=0; 
             int value=1;
          for(int i = 1; i<=10; i++) {
           value = no*i	;
         System.out.println(value);
         sum = sum+value;
		  }
   System.out.println(sum);
   }
}   