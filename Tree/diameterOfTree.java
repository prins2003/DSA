public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+leftHeight+rightHeight;
}

public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int option1 = height(root.left)+height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1,Math.max(option2,option3));
}


// effiecint :
class Pair {
    int height;
    int diameter;
    Pair(int height,int diameter){
        this.height=height;
        this.diameter=diameter;
    }
}

private static Pair daimeterHelper(BinaryTreeNode<Integer> root){
        if(root==null){
                Pair pair = new Pair(0,0);
                return pair;
        }
        
        Pair leftPair = daimeterHelper(root.left);
        Pair rightPair = daimeterHelper(root.right);
        
        int leftDiameter = leftPair.diameter;
        int rightDiameter = rightPair.diameter;
        
        int dis = leftPair.height + rightPair.height + 1;
        
        int diameter = Math.max(leftDiameter,Math.max(rightDiameter,dist));
        int height = Math.max(leftPair.height,rightPair.height)+1;
        
        return new Pair(diameter,height);
}

public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        Pair pair = diameterHelper(root);
        return pair.diameter;
}
