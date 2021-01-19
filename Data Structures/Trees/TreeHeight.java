 static int treeHeight(Node t1) {
      if(t1==null)
        return -1;
     int left=treeHeight(t1.leftChild);
     int right=treeHeight(t1.rightChild);
    
     if(left>right)
       return left+1;
     else
       return right+1;
  }
