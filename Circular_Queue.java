// Java program for Operations on Circular Queue
import java.util.ArrayList;

class Circular_Queue{

private int size, front, rear; //Variable declaration


private ArrayList<Integer> circular_queue = new ArrayList<Integer>(); //Declaring Integer array list

Circular_Queue(int queue_size) //Constructor
{
	this.size = queue_size;
	this.front = this.rear = -1;
}

public void enQueue(int queue_data) //Insertion Function
{
	if((front == 0 && rear == size - 1) ||
	(rear == (front - 1) % (size - 1))) // Condition if queue is full
	{
		System.out.print("Queue Full!");
	}

	else if(front == -1) // Condition for empty queue.
	{
		front = 0;
		rear = 0;
		circular_queue.add(rear, queue_data);
	}
	else if(rear == size - 1 && front != 0)
	{
		rear = 0;
		circular_queue.set(rear, queue_data);
	}
	else
	{
		rear = (rear + 1);
		// Adding a new element if
		if(front <= rear)
		{
			circular_queue.add(rear, queue_data);
		}
		// Else updating old value
		else
		{
			circular_queue.set(rear, queue_data);
		}
	}
}

public int deQueue() //Dequeue Function
{
	int temp;

	if(front == -1) //Checking for empty queue
	{
		System.out.print("Queue Empty!");
		return -1;
	}

	temp = circular_queue.get(front);

	if(front == rear) // For only one element
	{
		front = -1;
		rear = -1;
	}

	else if(front == size - 1)
	{
		front = 0;
	}
	else
	{
		front = front + 1;
	}
	return temp; // Returns dequeued element
}


public void displayQueue() // Display the elements of queue
{
	if(front == -1) // Check for empty queue
	{
		System.out.print("Queue is Empty");
		return;
	}
	System.out.print("Elements in the " +
					"circular queue are: ");

	if(rear >= front) //if rear has not crossed the size limit 
	{
		for(int i = front; i <= rear; i++) //print elements using loop
		{
			System.out.print(circular_queue.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

	else
	{
		for(int i = front; i < size; i++)
		{
			System.out.print(circular_queue.get(i));
			System.out.print(" ");
		}
		for(int i = 0; i <= rear; i++) // Loop for printing elements from 0th index till rear position
		{
			System.out.print(circular_queue.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}
}

// Driver code
public static void main(String[] args)
{
	Circular_Queue queue = new Circular_Queue(5); // Initialising new object of CircularQueue class.
	
	queue.enQueue(1);
	queue.enQueue(2);
	queue.enQueue(3);
	queue.enQueue(4);
	
	queue.displayQueue();

	int x = queue.deQueue();

	if(x != -1) // Check for empty queue
	{
		System.out.print("Deleted value = ");
		System.out.println(x);
	}
	x = queue.deQueue();
        
	if(x != -1) // Check for empty queue
	{
		System.out.print("Deleted value = ");
		System.out.println(x);
	}

	queue.displayQueue();
	
	queue.enQueue(5);
	queue.enQueue(6);
	queue.enQueue(7);
	
	queue.displayQueue();
	
	queue.enQueue(8);
}
}

