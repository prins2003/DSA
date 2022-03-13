public static TreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter num of children of " + frontNode.data);
                int numChildren = sc.nextInt();
                for(int i=0;i<numChildren;i++){
                    System.out.println("Enter "+(i+1)+"th child of" + frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueEmptyException e) {
                // Shouldn't come here
                return null;
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) throws QueueEmptyException {
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.print(frontNode.data + ":");
            int numChild = frontNode.children.size();
            for (int i=0;i<numChild;i++){
                System.out.print(frontNode.children.get(i).data+",");
                pendingNodes.enqueue(frontNode.children.get(i));
            }
            System.out.println();
        }
    }
