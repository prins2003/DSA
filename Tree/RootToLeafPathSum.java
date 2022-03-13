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
