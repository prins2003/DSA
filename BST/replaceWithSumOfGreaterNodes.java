class Solution{
    
    // modify the BST and return its root
    int sum = 0;
    public void helper(Node root){
        if(root==null){
            return;
        }
        helper(root.right);
        root.data=root.data+sum;
        sum=root.data;
        helper(root.left);
        return;
    }
    
    public Node modify(Node root)
    {
        //Write your code here
        if(root==null){
            return null;
        }
        helper(root);
        return root;
    }
    
}
