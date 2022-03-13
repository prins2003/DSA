public static int height(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count = 1;
        int maxHeight = 0;
        for(int i=0;i<root.children.size();i++){
            int hgt = height(root.children.get(i));
            if(maxHeight<hgt){
                maxHeight=hgt;
            }
        }
        return count+maxHeight;
    }
