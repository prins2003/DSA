public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(root.data);
            return result;
        }
        if(root.data>x){
            ArrayList<Integer> leftOutput = getPath(root.left,x);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        } else {
            ArrayList<Integer> rightOutput = getPath(root.right,x);
            if(rightOutput!=null){
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;
    }
