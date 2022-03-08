 boolean search(Node root, int x) {
        // Your code here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        boolean check = false;
        if(x>root.data){
            check = search(root.right,x);
        } else {
            check = search(root.left,x);
        }
        return check;
    }
