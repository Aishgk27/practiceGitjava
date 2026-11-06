package datastructure;

public class MyQueue {
	private int[] queue;
	private int top,bottom,capacity,size;
	
	public MyQueue(int capacity)
	{
		queue=new int[capacity];
		top=bottom=-1;
		this.capacity=capacity;
		
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(bottom==-1)
				bottom=0;
			
			queue[++top]=data;
			size++;
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			int data=queue[bottom];
			queue[bottom++]=0;
			size--;
			System.out.println("Deleted data : "+data);
			if(bottom==capacity)
			{
				top=bottom=-1;
			}
		}
	}
	public void print()
	{
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			for(int i=bottom;i<=top;i++)
				System.out.print(queue[i]+" ");
			System.out.println();
		}
	}
	
	public boolean isEmpty() {
		
		return top==-1||bottom==-1;
	}
	public boolean isFull() {
		
		return top==capacity-1;
	}
	public int size()
	{
		return size;
	}
	

}