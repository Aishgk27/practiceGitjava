package datastructure;

public class Main {
    public static void main(String[] args) {

        MyStack s = new MyStack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.print();

        s.peek();
        s.print();// returns 30
        int n=s.size();
       System.out.println(n);   // returns 3
        
        s.pop();

        s.print();

        s.peek();   // returns 20
        s.size();   // returns 2
    }
}