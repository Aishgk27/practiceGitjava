package logical;

public class Bubblesort {
	public static void main(String[] args) {
		int ar[] = {3,7,5,1};
		for(int i =0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
