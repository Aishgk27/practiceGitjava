package logical;

public class Small {
public static void main(String[] args) {
	int ar[]= {5,3,10,2,7};
	int small = ar[0];
	for(int i = 0;i<ar.length;i++)
	{
		if(ar[i]<small)
		{
			small = ar[i];
		}
		
	}
	System.out.println(small);
}
}
