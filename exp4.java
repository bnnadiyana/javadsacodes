package DSA;


public class exp4 
{
    Node head;

    class Node 
    {
        int data;
        Node next;

        Node( int d)
        {
            data=d;
            next=null;
        }
    }
    public void insert(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void delete(int pos)
    {
        if (head==null) 
        {
            return;            
        }
        Node current = head;
        if (pos==0) 
        {
            head=current.next;            
        }
        for (int i = 0; (i<pos-1)&&(current!=null); i++) 
        {
            current=current.next;            
        }
        if (current==null || current.next==null) 
        {
            return;            
        }
        Node next=current.next.next;
        current.next=next;
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
            current =current.next;            
        }
        return false;
    }
    public void display()
    {
        Node current =head;
        while (current!=null) 
        {
            System.out.print(current.data +" ");
            current= current.next;
        }
    }
    public static void main(String[] args) 
    {
        exp4 list =new exp4();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println();

        list.delete(2);
        list.display();
        System.out.println();
        
        System.out.println(list.search(5));
    }
}
