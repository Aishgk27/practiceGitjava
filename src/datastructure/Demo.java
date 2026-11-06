package datastructure;

public class Demo {

	public static void main(String[] args) {
		
		MyQueue q = new MyQueue(5);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);

		
		q.print();

		q.dequeue();
		q.dequeue();

		
		q.print();

		
	}
}