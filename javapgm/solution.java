import java.util.*;
class Solution
  {
    public static int solve(int r, int unit, int arr[], int n)
	 {
	    if (arr == null)
		   return -1;
		  int req = r * unit;
		  int sum = 0;
		  int count = 0;
		  
		for(int i=1 ; i<=n ; i++)
		  {
		     sum = sum + arr[i];
			 count++;
			 if(sum >= req)
			   break;
			   }
			     return count;
				 }
				 
 public static void main(String args[])
   {
     Scanner sf = new Scanner(System.in);
	   int r = sf.nextInt();
	   int unit = sf.nextInt();
	   int n = sf.nextInt();
	   int arr[] = new int[n];
  
    for(int i=0 ; i<=n ; i++)
           arr[i] = sf.nextInt();
		   System.out.println(solve(r,unit,arr,n));
		   }
		   }

		   