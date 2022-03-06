public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            String str = "";
            str = str + front.data + ":";
            if(front.left!=null){
                pendingNodes.add(front.left);
                str = str + "L"+front.left.data;
            }
            if(front.right!=null){
                pendingNodes.add(front.right);
                str = str + "R"+front.right.data;
            }
            System.out.println(str);
        }
        return;
    }
