public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root,int x){
  if(root==null){
    return 0;
  }
  int count = (root.data>x)?1:0;
  
  if(root.left!=null){
    count+=countNodesGreaterThanX(root.left,x);
  }
  if(root.right!=null){
    count+=countNodesGreaterThanX(root.right,x);
  }
  
  return count;
}
