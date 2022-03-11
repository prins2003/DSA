public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data :");
        } else {
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBetter(false,rootData,true);
        BinaryTreeNode<Integer> rightChild = takeInputBetter(false,rootData,false);

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
