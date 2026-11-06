package logical;

public class Num5 {
	
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				sum =sum+i;
		}
		System.out.println(sum);
	}

}
