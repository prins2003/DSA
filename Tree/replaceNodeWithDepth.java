public static BinaryTreeNode<Integer> Helper(BinaryTreeNode<Integer> root,int level){
        if(root==null){
            return root;
        }
        if(root!=null){
          root.data=level;  
        }
        
        root = Helper(root.left,level+1);
        root = Helper(root.right,level+1);
        return root;
    }
    
    public static BinaryTreeNode<Integer> changeToDepthTree(BinaryTreeNode<Integer> root) {
        // Write your code here.
        return Helper(root,0);
    }
