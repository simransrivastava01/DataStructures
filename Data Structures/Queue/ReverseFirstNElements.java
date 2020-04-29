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
  static void reverseKelementsQueue(QueueArray q, int K)
{
  int arr[]=new int[q.SIZE];
  int a=0,l=0;
  while(q!=null)
  {
    a=q.dequeue();
    if(a==-1)
    {break;}
    else
    {arr[l]=a;
     l++;}
  }
  for(int i=(K-1);i>=0;i--)
  {q.enqueue(arr[i]);}
  for(int i=K;i<l;i++)
  {q.enqueue(arr[i]);}
  
}
 public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n, q1, q2, k;
      QueueArray ob1=new QueueArray();
      n = s.nextInt();
      k = s.nextInt();
      q2=n;
      while(n>0)
      {
        q1 = s.nextInt();
        ob1.enqueue(q1);
        n--;
      }
      reverseKelementsQueue(ob1, k);
      while(q2>0)
      {
        System.out.print(ob1.dequeue() + " ");
        q2--;
      }
    System.out.println();
  }
}