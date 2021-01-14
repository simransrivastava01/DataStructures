static int countLeafs(Node root) {
    if(root==null)
      return 0;
    if(root.leftChild==null && root.rightChild==null)
    {
      l++;
    }
    countLeafs(root.leftChild);
    countLeafs(root.rightChild);
    
    return l;
  }

  static int countNonLeafs(Node root) 
  {
    if(root==null)
      return 0;
    if(root.leftChild!=null || root.rightChild!=null)
    {
      nl++;
    }
    countNonLeafs(root.leftChild);
    countNonLeafs(root.rightChild);
    
    return nl;
  }
