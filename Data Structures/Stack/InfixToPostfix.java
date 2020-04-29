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
    static int checkPrecedence(char ch)
  {
    switch (ch)
    {
      case '+':
      case '-':      return 1;
      case '*':
      case '/':      return 2;
      case '^':      return 3;
    }
    return -1;
  }
static String infixToPostfix(CQStack s, String exp)
{
  String pf="";
  for(int i=0;i<exp.length();i++)
  {
    char c=exp.charAt(i);
    if(c>=65 && c<=91 || c>=97 && c<=122)
    {
      pf=pf+c;
    }
    else if(c=='(')
    {
     s.push(c); 
    }
    else if(c==')')
    {
      while(!s.isEmpty() && s.stackArray[s.top]!='(')
      {
        pf=pf+(char)s.pop();
      }
      if(s.stackArray[s.top]=='(')
      {
        s.pop();
      }
    }
    else
    {
      while(!s.isEmpty() && checkPrecedence(c) <= checkPrecedence((char)s.stackArray[s.top]))
      {
        pf=pf+(char)s.pop();
      }
      s.push(c);
    }
  }
   while (!s.isEmpty())	  // pop all the operators from the stack
      pf= pf+(char)s.pop();
return pf;
}
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int n, q1, q2;
    String st;
      st = s.nextLine();
      st = infixToPostfix(theStack, st);
      System.out.println(st);
  }
}