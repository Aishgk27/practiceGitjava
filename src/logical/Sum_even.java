package logical;

public class Sum_even {
 public static void main(String[] args) {
	int ar[] = {5,10,3,2,7};
	int e_sum = 0;
	int o_sum = 0;
	for(int i =0;i<=ar.length-1;i++)
	{
		if(ar[i]%2==0)
		{
			e_sum = e_sum+ar[i];
		}
		else if (ar[i]%2==1)
		{
			o_sum = o_sum+ar[i];
		}
	}
	System.out.println("Even sum = "+e_sum);
	System.out.println("Odd sum = "+o_sum);
}
}
