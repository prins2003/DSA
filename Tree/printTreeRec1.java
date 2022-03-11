public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

//        if(root.left!=null){
//            printTree(root.left);
//        }
//        if(root.right!=null){
//            printTree(root.right);
//        }
    }
