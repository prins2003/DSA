public static void preOrder(TreeNode<Integer> root){
        // this is edge case not a base case
        if(root==null){
            return;
        }
        System.out.println(root.data);
        for(int i=0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }
    }

    public static void postOrder(TreeNode<Integer> root){
        // this is edge case not a base case
        if(root==null){
            return;
        }
        for(int i=0;i<root.children.size();i++){
            postOrder(root.children.get(i));
        }
        System.out.println(root.data);
    }
