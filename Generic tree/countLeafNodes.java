 public static int leafNode(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
        int count=0;
        for(int i=0;i<root.children.size();i++){
            count = count+leafNode(root.children.get(i));
        }
        return count;
    }
