
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
		list.print();
		System.out.println();
		System.out.println("Middle element in the list : "+findMiddle(head));
	}
	
static int findMiddle(Node head) 
{
  Node last=head;
  int c=0;
  if(head==null)
  {return -1;}
  while(last!=null)
  {c++;
  last=last.next;}
  last=head;
  for(int i=0;i<c/2;i++)
  {last=last.next;}
 
  return last.data;
}

}
