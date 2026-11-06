package datastructure;

public class ParkingLot {
	private int[] slot;
	private int i,capacity,size;
	
	public ParkingLot(int capacity) 
	{
		slot=new int[capacity];
		i=-1;
		this.capacity=capacity;
	}
	public void park()
	{
		if(isFull())
			System.out.println("No slots available");
		else
		{
			if(i==-1)
			{
				slot[++i]=1;
				size++;
				return;
			}
			while(slot[i]==1)
			{
				i++;
			}
			slot[i]=1;
			size++;
		}
	}
	public boolean isFull()
	{
		return size==capacity;
	}

	public void park(int pos)
	{
		if(slot[pos-1]==1)
			System.out.println("Slot is occupied");
		else
		{
			slot[pos-1]=1;
			size++;
		}
	}
	public void dispatch(int pos)
	{
		if(slot[pos-1]==0)
			System.out.println("Slot is not assigned");
		else
		{
			slot[pos-1]=0;
			size--;
		}
	}
	public void display()
	{
		for (int i = 0; i < slot.length; i++) {
			System.out.print(slot[i]+" ");
		}
		System.out.println();
	}
	public int size()
	{
		return size;
	}
}

