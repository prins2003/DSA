public static int minimum(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data,Math.min(leftMin,rightMin));
    }
    public static int maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftMin = maximum(root.left);
        int rightMin = maximum(root.right);
        return Math.max(root.data,Math.max(leftMin,rightMin));
    }
    
    
    boolean isBST(Node root)
    {
        // code here.
        if(root==null){
            return true;
        }
        int leftMax = maximum(root.left);
        if(leftMax>=root.data){
            return false;
        }
        int rightMin = minimum(root.right);
        if(rightMin<root.data){
            return false;
        }
        boolean ans1 = isBST(root.left);
        boolean ans2 = isBST(root.right);
        return ans1 && ans2;
    }
