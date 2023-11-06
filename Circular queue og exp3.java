package DSA;

public class exp3
{
    int front,rear;
    int qu[];
    int size;
    public void ini(int n)
    {
      qu=new int[n];
      front=rear=-1;
      size=qu.length;
    }
    public boolean isEmpty()
    {   
        if (front == -1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {   
        if (front == 0 && rear == size - 1) 
          {
            return true;
          }
          if (front == rear + 1) 
          {
            return true;
          }
          return false;

    }
    
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            int m=qu[front];
            if(front==rear)
            {
                front=rear=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            System.out.println("Dequeued element:" + m);
        }
    }
    public void enqueue(int ele)
    {
        if(isFull())
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if (front==-1)
                front=0;
            rear=(rear+1)%size;
            qu[rear]=ele;
        }
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
       /* else
        {
            int i;
            for (i = front; i!=rear ;i=(i+1)%size) 
            {
                System.out.println( "Queue element: " + qu[i]);
            }
            System.out.println("Queue element:" + qu[i]);
        }*/
        else 
        {
            int i;
            for (i = front; i != rear; i = (i + 1) % size) 
            {
                System.out.println("Queue element: " + qu[i]);
            }
            // Print the last element (rear)
            System.out.println("Queue element: " + qu[i]);
        }
    }
    public static void main(String[] args) 
    {
        exp3 obj=new exp3();
        obj.ini(5);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);
        obj.display();

        obj.dequeue();
        obj.dequeue();

        obj.enqueue(100);
        obj.display();

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(100);

        obj.dequeue();        
        obj.dequeue();
       

    }
}
