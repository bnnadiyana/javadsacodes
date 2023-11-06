package DSA;

class exp1 
{
    
    int top;
    int st[];
    public void ini(int n)
    {
      st=new int[n];
      top=-1;
    }
    public void empty()
    {
        if (top==-1) 
        {
            System.out.println("Stack is Empty");            
        }
        else
        {
            System.out.println("Stack is not empty");
        }

    }
    public void top()
    {
        if (top==-1) 
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Top element:" + st[top]);
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Popped:" +""+ st[top]);
            top--;
        }
    }
    public void push(int ele)
    {
        if(top==st.length-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            st[top]=ele;
        }
    }
    public static void main(String[] args) 
    {
        exp1 obj=new exp1();
        obj.ini(5);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.push(80);
        obj.push(90);

        obj.pop();
        obj.pop();

        obj.top();

        obj.pop();
        obj.pop();
        obj.empty();
       //obj.top(); 
    }
}
/*class exp1 {
    int top;
    int st[];

    public void ini(int n) {
        st = new int[n];
        top = -1;
    }

    public void empty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(st[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped: " + st[top]);
            top--;
        }
    }

    public void push(int ele) {
        if (top == st.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            st[top] = ele;
        }
    }

    public static void main(String[] args) {
        exp1 obj = new exp1();
        obj.ini(5);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.push(80);
        obj.push(90);

        // Pop two elements from the stack
        obj.pop();
        obj.pop();

        // Check if the stack is empty
        obj.empty();

        // Conclusion message
        System.out.println("Program completed.");
    }
}*/