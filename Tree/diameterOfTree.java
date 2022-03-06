public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+leftHeight+rightHeight;
}

public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int option1 = height(root.left)+height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1,Math.max(option2,option3));
}
