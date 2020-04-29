
//insertion at end 

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
		list.print();
	}
}

