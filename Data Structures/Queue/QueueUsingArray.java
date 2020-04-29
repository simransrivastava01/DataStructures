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
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n, q1, q2;
      QueueArray ob1=new QueueArray();
      n = s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1)
        {
          q2 = s.nextInt();
          ob1.enqueue(q2);
        }
        else
          System.out.print(ob1.dequeue() + " ");
        n--;
      }
      System.out.println();
  }
}