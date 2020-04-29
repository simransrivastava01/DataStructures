import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

class LinkedList {
    Node head;
    
    void insert(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=n;
        }
    }
    void print()
    {
        Node last=head;
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last=last.next;
        }
    }
   
    void delete(int pos)
    {
        Node last=head;
        int size=0;
        while(last!=null)
        {size++;
            last=last.next;
        }
        last=head;
        if(pos==1)
        {
            head=head.next;
        }
        else
        {
        for(int i=1;i<=size;i++)
        {
            if(i==(pos-1))
            {
              last.next=last.next.next;
            }
            else
            {
                last=last.next;
            }
        }
        }
    }
    void ins(int pos,int data)
    {
        Node last=head;
        Node n=new Node(data);
        if(pos==1)
        {
            n.next=head;
            head=n;
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                last=last.next;
            }
            n.next=last.next;
            last.next=n;
        }
    }
}

class Main {
	public static void main (String[] args) {
		LinkedList list = new LinkedList();
		Scanner s = new Scanner(System.in);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.delete(3);
		list.print();
	}
}

