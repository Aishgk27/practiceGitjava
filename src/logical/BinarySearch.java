package logical;

public class BinarySearch {
 static void search(int ar[],int key)
 {
	 int s = 0;
	 int e = ar.length-1;
	 while(s<=e)
	 {
		 int mid = (s+e)/2;
		 if(ar[mid]==key)
		 {
			 System.out.println("Element found");
			 return;
		 }
		 if(key>ar[mid])
			 s = mid+1;
		 else
			 e = mid-1;
	 }
	 System.out.println("Element not found");
	 }
     public static void main(String[]args)
     {
    	 int[]ar = {1,2,7,49,2011};
    	 int key = 10;
    	 search(ar,key);
 }
}
