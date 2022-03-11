 public static boolean isBST2(BinaryTreeNode<Integer> root,int minRange,int maxRange){
        if(root==null){
            return true;
        }
        if(root.data< minRange || root.data > maxRange){
            return false;
        }
        boolean isLeftWithinRange= isBST2(root.left,minRange,root.data-1);
        boolean isRightWithinRange= isBST2(root.right,root.data,maxRange);
        return isLeftWithinRange && isRightWithinRange;
    }
