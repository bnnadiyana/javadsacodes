package DSA;

public class exp5 
{
    Node head;

    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data=d;
            prev=null;
            next=null;
        }
    }
    public void insert(int new_data)
    {
        Node new_node=new Node(new_data);
        if (head==null)
            head=new_node;
        else
        {
            Node current=head;
            while (current.next!=null) 
            {
                current=current.next;
            }
            current.next=new_node;
            new_node.prev=current;
        }
    }
    public void delete(int data)
    {
        Node current=head;
        while (current!=null) 
        {
            if (current.data==data) 
            {
                if (current.prev!=null) 
                {
                    current.prev.next=current.next;                    
                }
                else
                {
                    head=current.next;
                }
                if (current.next!=null) 
                {
                    current.next.prev=current.prev;                    
                }
                break;
            }
            current=current.next;
        }
    }
    public boolean search(int data)
    {
        Node current=head;
        while (current!=null) 
        {
            if (current.data==data) 
            {
                return true;                
            }            
            current=current.next;
        }
        return false;
    }
    public void display()
    {
        Node current =head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;            
        }
    }
    public static void main(String[] args) 
    {
        exp5 list =new exp5();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println();

        list.delete(4);
        list.display();
        System.out.println();
        
        System.out.println(list.search(4));
    }
}
