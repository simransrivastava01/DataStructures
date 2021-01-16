class Result {
  static int c1=0,c2=0;
  static int countLeft(Node root)
  {
    if(root==null)
      return 0;
    c1++;
    countLeft(root.leftChild);
    countLeft(root.rightChild);
    return c1;
  }
  static int countRight(Node root)
  {
    if(root==null)
      return 0;
    c2++;
    countRight(root.leftChild);
    countRight(root.rightChild);
    return c2;
  }
  static int isFoldable(Node root) {
      if(root==null)
        return 1;
     int f1=countLeft(root.leftChild);
     int f2=countRight(root.rightChild);
     if(f1==f2)
       return 1;
    else
      return 0;
  }
