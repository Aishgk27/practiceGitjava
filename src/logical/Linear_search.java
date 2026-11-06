package logical;

public class Linear_search {
	static void search(int ar[] , int key)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==key)
			{
				System.out.println("Element found");
				return;
			}
		}
		System.out.println("Element not found");
	}
public static void main(String[] args) {
	int ar[] = {6,8,5,3,2};
	int key = 6;
	search(ar,key);
}
}
