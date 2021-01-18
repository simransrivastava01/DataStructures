static Node findMirror(Node root)
{
   if(root==null)
     return null;
   findMirror(root.leftChild);
   findMirror(root.rightChild);
  
   Node temp=root.leftChild;
   root.leftChild=root.rightChild;
   root.rightChild=temp;
  
  return root;
}
