public static int findMax(Node root){
        //code here
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftlarge = findMax(root.left);
        int rightlarge = findMax(root.right);
        return Math.max(root.data,Math.max(leftlarge,rightlarge));
    }
    public static int findMin(Node root){
        //code here
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.data,Math.min(leftMin,rightMin));
    }
