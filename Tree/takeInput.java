public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter root data :");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInput();
        BinaryTreeNode<Integer> rightChild = takeInput();

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
