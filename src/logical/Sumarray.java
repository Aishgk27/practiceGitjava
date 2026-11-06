package logical;

public class Sumarray {
public static void main(String[] args) {
	int ar[]= {5,3,10,2,7};
	int sum = 0;
	for(int i=0;i<=ar.length-1;i++)
	{
		sum = sum+ar[i];
	}
	System.out.println(sum);
}
}
