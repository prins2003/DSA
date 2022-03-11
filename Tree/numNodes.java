public static int numNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
