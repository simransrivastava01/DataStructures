static Node tree(int arr[],Node root,int i,int n)
{
  if(i<n)
  {
    Node rNode = new Node(arr[i]);
    root=rNode;
    root.leftChild=tree(arr,root.leftChild,2*i+1,n);
    root.rightChild=tree(arr,root.rightChild,2*i+2,n);
  }
  return root;
}
static Node buildTree(int t[], int n)
{
  Node node = null;
  // Complete the function body
  node = tree(t,node,0,n);
  return node;
}