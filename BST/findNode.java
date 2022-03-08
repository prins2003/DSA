public static boolean searchInBST(BinaryTreeNode<Integer> root, int data){
  if(root==null){
    return null;
  }
  if(root.data==data){
    return root;
  } else if(data<root.data){
    return findNode(root.left,data);
  } else {
    return findNode(root.right,data);
  }
}
    
