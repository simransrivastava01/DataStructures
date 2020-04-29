import java.util.*;
class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s;
    stackArray = new int[maxSize];
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(top==maxSize)
    {return ;}
    else
    {
      top++;
      stackArray[top]=j;
    }
  }
  
  public int pop() // take item from top of stack
  {
    int data=0;
    if(isEmpty())
    {return -1;}
    else
    {
    
      data=stackArray[top];
       stackArray[top]=0;
        top--;
     
    }
    return data;
  }

  public boolean isEmpty() // true if stack is empty
  {
    if(top==-1)
    {return true;}
    else
    {return false;}
  }

  public boolean isFull() // true if stack is full
  {
    if(top==maxSize)
    {return true;}
    else
    {return false;}
  }
}
class Main
{
 static int evalPrefix(CQStack s, String exp) {
     int l=exp.length();
  for(int i=0;i<l;i++)
  {
    char c=exp.charAt(l-1-i);
    if(c>=48 && c<=57)
    {s.push(c-'0');}
    else
    {
      int n1=s.pop();
      int n2=s.pop();
      int p=1;
      switch(c)
      {
        case '+': s.push(n1+n2); break;
        case '-': s.push(n1-n2); break;
        case '*': s.push(n1*n2); break;
        case '/': s.push(n1/n2); break;
        case '^': for(int j=0;j<n2;j++)
                  {
                     p=p*n1;
                  }
            s.push(p); break;
      }
    }
  }
   return s.pop();
}
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    String st;
      st = s.nextLine();
      System.out.println(evalPrefix(theStack, st));
  }
}