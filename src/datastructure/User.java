package datastructure;

class User
{
    public static void main(String[] args)
    {
        MyArray m1 = new MyArray(5);

        m1.insert(10);
        m1.insert(20);
        m1.insert(30);
        m1.insert(40);

        m1.print();

        m1.search(30);
          }
}