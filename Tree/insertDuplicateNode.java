 public static BinaryTreeNode<Integer> insertDuplicateNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        int rootData = root.data;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(rootData);
        newNode.left = root.left;
        root.left = newNode;
        newNode.left = insertDuplicateNode(newNode.left);
        root.right = insertDuplicateNode(root.right);
        return root;
}
