static void printLeft(Node root)
  {
    if(root==null)
      return ;
    printLeft(root.leftChild);
    System.out.print(root.data+" ");
  }
  static void printRight(Node root)
  {
    if(root==null)
      return ;
    System.out.print(root.data+" ");
    printRight(root.rightChild);
  }
  static void printTopView(Node root) {
     if(root==null)
       return ;
     printLeft(root.leftChild);
     System.out.print(root.data+" ");
     printRight(root.rightChild);
  }
