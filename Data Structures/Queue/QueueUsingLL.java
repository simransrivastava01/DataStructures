import java.util.*;
class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
    this.next = null;
  }
}

class QueueLinkedList
{
  public QueueNode front;
  public  QueueNode rear=front;
   public QueueLinkedList()
  {
    front = rear = null;
  } 

  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    QueueNode q=new QueueNode(data);
    rear=front;
    if(front==null)
    {front=q;}
    else
    {
      rear=front;
      while(rear.next!=null)
      {
        rear=rear.next;
      }
      rear.next=q;
    }
  }    

  /*  Function to DeQueue an element from the Queue */
  public int DeQueue()
  {
    int a;
    if(front==null)
    {return -1;}
    else
    {a=front.data;
    front=front.next;}
    return a;
  }    
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n, q1, q2;
      QueueLinkedList ob1=new QueueLinkedList();
      n = s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1)
        {
          q2 = s.nextInt();
          ob1.EnQueue(q2);
        }
        else
          System.out.print(ob1.DeQueue() + " ");
        n--;
      }
      System.out.println();
  }
}