
//Copy first list to second list

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
class Main {
    	static Node head;
    
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
	public static void main(String[] args) {
		
	    Main list = new Main();
		Scanner s = new Scanner(System.in);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		Node t=copyList(head);
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	
        static Node copyList(Node org)
        {
            if(org==null)
              return null;
           Node head=null;
           Node n = new Node(org.data);
           head=n;

           Node temp=org.next;
           Node last=head;
           while(temp!=null)
           {
              last.next=new Node(temp.data);
              last=last.next;
              temp=temp.next;
           }
       return head;
     }
}
}
