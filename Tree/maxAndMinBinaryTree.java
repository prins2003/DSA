public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            Pair<Integer,Integer> pa = new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            return pa;
        }
        Pair<Integer,Integer> p = new Pair<>(root.data,root.data);
        Pair<Integer,Integer> p1 = getMinAndMax(root.left);
        if(p1.minimum<p.minimum){
            p.minimum = p1.minimum;
        }
        if(p1.maximum>p.maximum){
            p.maximum = p1.maximum;
        }
        Pair<Integer,Integer> p2 = getMinAndMax(root.right);
        if(p2.minimum<p.minimum){
            p.minimum = p2.minimum;
        }
        if(p2.maximum>p.maximum){
            p.maximum = p2.maximum;
        }
        return p;
	}
