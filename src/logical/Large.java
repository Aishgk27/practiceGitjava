package logical;

public class Large {
	public static void main(String[] args) {
		int ar[] = {5,3,10,2,7};
		int large = ar[0];
		for(int i =0;i<=ar.length-1;i++)
		{
			if(ar[i]>large)
			large = ar[i];
		}
		System.out.println(large);
	}

}
