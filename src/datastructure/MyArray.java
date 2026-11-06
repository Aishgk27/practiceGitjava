package datastructure;

class MyArray
{
    private int[] ar;
    private int capacity;
    private int size;

 
    public MyArray(int capacity)
    {
        this.capacity = capacity;
        ar = new int[capacity];
        size = 0;
    }

  
    public boolean isFull()
    {
        return size == capacity;
    }

   
    public void insert(int data)
    {
        if(isFull())
        {
            System.out.println("Array is Full");
        }
        else
        {
            ar[size] = data;
            size++;
        }
    }

    // Print array
    public void print()
    {
        if(size == 0)
        {
            System.out.println("Array is Empty");
        }
        else
        {
            for(int i = 0; i < size; i++)
            {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }
    }


    public int search(int key)
    {
        for(int i = 0; i < size; i++)
        {
            if(ar[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}