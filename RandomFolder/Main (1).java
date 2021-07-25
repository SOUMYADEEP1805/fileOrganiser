import java.util.ArrayDeque;
import java.util.Queue;

// Implement Stack using single queue and recursion
class Stack<T>
{
	Queue<T> q;

	// Constructor
	public Stack() {
		q = new ArrayDeque<>();
	}

	// Insert an item into the stack
	public void add(T data) {
		q.add(data);
	}

	// Utility function to reverse contents of a queue
	private void reverseQueue()
	{
		// base case
		if (q.isEmpty()) {
			return;
		}

		// hold front element in recurion call stack and insert
		// it back into the queue after recursive call is over

		T front = q.peek();
		q.poll();

		reverseQueue();

		q.add(front);
	}

	// Remove the top item from the stack
	public T poll()
	{
		// if the queue is isEmpty
		if (q.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(0);
		}

		// reverse the queue
		reverseQueue();

		// pop front element of reversed queue
		T front = q.peek();
		q.poll();

		// revert the queue to original state
		reverseQueue();

		return front;
	}
}

class Main
{
	public static void main(String[] args)
	{
		int[] keys = { 1, 2, 3, 4, 5 };

		// insert above keys into the stack
		Stack s = new Stack();
		for (int key : keys) {
			s.add(key);
		}

		for (int i = 0; i <= keys.length; i++) {
			System.out.println(s.poll());
		}
	}
}