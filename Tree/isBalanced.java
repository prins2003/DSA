public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }


public static BalanceTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int height = 0;
            boolean isBal = true;
            BalanceTreeReturn ans = new BalanceTreeReturn();
            ans.height = height;
            ans.isBalance = isBal;
            return ans;
        }
        BalanceTreeReturn leftOutput = isBalancedBetter(root.left);
        BalanceTreeReturn rightOutput = isBalancedBetter(root.right);

        boolean isBal = true;
        int height = 1 +Math.max(leftOutput.height, rightOutput.height);
        if(Math.abs(leftOutput.height- rightOutput.height)>1){
            isBal = false;
        }
        if(!leftOutput.isBalance==false || rightOutput.isBalance==false ){
            isBal=false;
        }
        BalanceTreeReturn ans = new BalanceTreeReturn();
        ans.isBalance = isBal;
        ans.height = height;
        return ans;
    }
