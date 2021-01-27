static int evaluateTree(Node root) {
      if(root==null)
        return 0;
      if(root.leftChild==null && root.rightChild==null)
        return root.data;
      int a=evaluateTree(root.leftChild);
      int b=evaluateTree(root.rightChild);
    
      if(root.data==42)
        return a*b;
      else if(root.data==43)
        return a+b;
      else if(root.data==45)
        return a-b;
      else
        return a/b;
  }
