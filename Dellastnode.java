public class Dellastnode
{
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Node head;
    Dellastnode()
    {
        head=null;
    }

    public void add(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void dellastnode()
    {
       if(head==null)
       {
           throw new IllegalArgumentException("Deletion attempted on empty list");
       }
       Node temp=head;
       while(temp.next.next!=null)
       {
           temp=temp.next;
       }
       temp.next=null;
    }
    public void display()
    {
        if(head==null)
        {
            throw new IllegalArgumentException("The list is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Dellastnode l=new Dellastnode();
        l.add(3);
        l.add(5);
        l.add(4);
        l.display();
        l.dellastnode();
        l.display();
    }
}
