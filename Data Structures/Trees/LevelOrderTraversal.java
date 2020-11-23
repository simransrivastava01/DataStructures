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
static Node level(Node root,int i)
{
  if(root==null)
    return null;
  if(i==1)
    System.out.print(root.data);
  else
  {
    level(root.leftChild,i-1);
    System.out.print(" ");
    level(root.rightChild,i-1);
  }
  return root;
}
static void printLevelWise(Node root)
{
   if(root==null)
     return ;
   int h=height(root);
   for(int i=1;i<=h;i++)
   {
      level(root,i);
      System.out.println();
   }
}