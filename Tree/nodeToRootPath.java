public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(root.data);
            return result;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left,x);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = nodeToRootPath(root.right,x);
        if(rightOutput!=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }
