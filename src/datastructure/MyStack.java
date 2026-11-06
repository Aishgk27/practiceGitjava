package datastructure;


public class MyStack {
	
	private int[] stack;
	private int top,capacity,size;
	
	public MyStack(int capacity)
	{
		stack=new int[capacity];
		this.capacity=capacity;
		top=-1;
	}
	
	public void push(int data)
	{
		if(isFull())
			System.out.println("Stack is overflow");
		else
		{
			stack[++top]=data;
			size++;
		}
	}
	public boolean isFull()
	{
		return top==capacity-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void pop()
	{
		if(isEmpty())
			System.out.println("Stack is underflow");
		else
		{
		 
			System.out.println("Poped element is="+stack[top]);
			stack[top--]=0;
			
			size--;	
		}
	}
	public void print()
	{
		if(isEmpty())
			System.out.println("Stack is underflow");
		else
		{
			for (int j = 0; j<=top; j++) {
				System.out.print(stack[j]+" ");
			}
			System.out.println();
		}
	}
			public int peek()
			{
				return stack[top];
			}
			
			public int size()
			{
				return size;
		 }
		 }