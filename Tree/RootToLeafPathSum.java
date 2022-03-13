public static boolean helper(Node root,int S,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum=sum+root.data;
            if(sum==S){
                return true;
            }
            return false;
        }
        return helper(root.left,S,sum+root.data) || helper(root.right,S,sum+root.data);
   }
    
    boolean hasPathSum(Node root, int S) {
        // Your code here
        return helper(root,S,0);
    }


// Print Path

private static void rootToLeafPathSumHelper(BinaryTreeNode<Integer> root,int k,String path,int currSum){
        if(root=null){
                return;
        }
        if(root.left==null && root.right==null){
                currSum += root.data;
                if(currSum==k){
                        System.out.println((path+root.data+" "));
                }
                return;
        }
        rootToLeafPathSumHelper(root.left,k,(path+root.data+" "),currSum+root.data);
        rootToLeafPathSumHelper(root.right,k,(path+root.data+" "),currSum+root.data);
}

public static void rootToLeafPathSum(BinaryTreeNode<Integer> root,int k){
        rootToLeafPathSumHelper(root,k,"",0);
}

}
