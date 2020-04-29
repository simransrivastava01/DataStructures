import java.util.*;

class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  // Method to add an item to the queue.
  void enqueue(int item)
{
  if(front==-1 && rear==-1)
  {
    front++;
    rear++;
    array[rear]=item;
  }
  else
  {
    array[++rear]=item;
  }
}

// Method to remove an item from queue.
int dequeue()
{
  if(front>rear)
  {return -1;}
  int item=array[front];
  front++;
  return item;
}
}
class Main
{
    static void reverseQueue(QueueArray q)
 {
  int arr[]=new int[q.SIZE];
  int l=0;
    int a;
   while(q!=null)
   { 
    a=q.dequeue();
    if(a==-1)
   {break;}
    else
    {arr[l]=a;
     l++;}
   }
 for(int i=(l-1);i>=0;i--)
   {q.enqueue(arr[i]);}
  System.out.println();
 }
 public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  int n, q1, q2;
    QueueArray ob1=new QueueArray();
    n = s.nextInt();
    q2=n;
    while(n>0)
    {
      q1 = s.nextInt();
      ob1.enqueue(q1);
      n--;
    }
    reverseQueue(ob1);
    while(q2>0)
    {
      System.out.print(ob1.dequeue() + " ");
      q2--;
    }
  System.out.println();
}
}