public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr,int n){
  return sortedArrayToBST(arr,0,n-1);
}

private static BinaryTreeNode<Integer> sortedArrayToBSTHelper(int[] arr,int start,int end){
  if(start>end){
    return null;
  }
  
  BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
  temp.left = sortedArrayToBSTHelper(arr,start,mid-1);
  temp.right = sortedArrayToBSTHelper(arr,mid+1,end);
  return temp;
}
}

  
