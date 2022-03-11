public class isBSTReturn {
    int min;
    int max;
    boolean isBST;
    isBSTReturn(){
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.isBST = true;
    }
}


public static isBSTReturn isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            isBSTReturn ans = new isBSTReturn();
            return ans;
        }
        isBSTReturn leftAns = isBST(root.left);
        isBSTReturn rightAns = isBST(root.right);
        int min = Math.min(root.data,Math.min(leftAns.min,rightAns.min));
        int max = Math.max(root.data,Math.max(leftAns.max,rightAns.max));
        boolean isBST = true;
        if(leftAns.max<=root.data){
            isBST = false;
        }
        if(rightAns.min<root.data){
            isBST = false;
        }
        if(!leftAns.isBST){
            isBST = false;
        }
        if(!rightAns.isBST){
            isBST = false;
        }
        isBSTReturn result = new isBSTReturn();
        result.min = min;
        result.max = max;
        result.isBST = isBST;
        return result;
    }
