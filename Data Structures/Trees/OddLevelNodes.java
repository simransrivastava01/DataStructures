/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
class Result {
  static int height(Node root)
  {
    if(root==null)
      return 0;
    int left=height(root.leftChild);
    int right=height(root.rightChild);
    
    if(left>right)
      return left+1;
    else
      return right+1;
  }
  static Node level(Node root,int l)
  {
    if(root==null)
      return null;
    if(l==1)
      System.out.print(root.data+" ");
    else
    {
      level(root.leftChild,l-1);
      level(root.rightChild,l-1);
    }
    return root;
  }
  static void printOdd(Node root) {
      if(root==null)
        return ;
      int h=height(root);
     for(int i=1;i<=h;i=i+2)
     {
       level(root,i);
     }
  }
}