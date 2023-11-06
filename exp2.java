package DSA;

/*public class exp2 
{
    int front,rear;
    int st[];
    public void ini(int n)
    {
      st=new int[n];
      front=rear=0;
    }
    public void empty()
    {
        if (front==st.length) 
        {
            System.out.println("Queue is Empty");            
        }
        else
        {
            System.out.println("Queue is not empty");
        }

    }
    public void front()
    {
        if (front==st.length) 
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            System.out.println("Front element:"+ "" + st[front]);
        }
    }
    public void dequeue()
    {
        if((front==rear)||(front==st.length))
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Dequeued element:" + "" + st[front]);
            front++;
        }
    }
    public void enqueue(int ele)
    {
        if(rear==st.length)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            st[rear]=ele;
            rear++;
        }
    }
    public static void main(String[] args) 
    {
        exp2 obj=new exp2();
        obj.ini(5);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);

        obj.dequeue();
        obj.dequeue();

        obj.front();

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.empty();
    }
} */

public class exp2 {
    int front, rear;
    int st[];
    int size;

    public void ini(int n) {
        st = new int[n];
        front = rear = -1;
        size = n;
    }

    public void empty() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public void front() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element:" + st[front]);
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Dequeued element:" + st[front]);
            if (front == rear) {
                // The queue becomes empty after dequeuing the last element
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    public void enqueue(int ele) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                // If the queue is empty, set front to 0
                front = 0;
            }
            rear++;
            st[rear] = ele;
        }
    }

    public static void main(String[] args) {
        exp2 obj = new exp2();
        obj.ini(5);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);

        obj.dequeue();
        obj.dequeue();

        obj.front();

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.empty();
    }
}