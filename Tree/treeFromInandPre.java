public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return buildTreeHelper(inorder,preorder,0,preorder.length-1,0,inorder.length-1,n);
    }
    
    public static Node buildTreeHelper(int inorder[],int preorder[],int siPre,int eiPre,int siIn,int eiIn,int n){
        if(siPre > eiPre){
            return null;
        }
        int rootData = preorder[siPre];
        Node root = new Node(rootData);
        int rootIndex = -1;
        for(int i=siIn;i<=eiIn;i++){
            if(inorder[i]==rootData){
                rootIndex = i;
                break;
            }
        }
        
        
        int siPreLef = siPre+1;
        int eiPreRig = eiPre;
        int siInLef = siIn;
        int eiInLef = rootIndex-1;
        int siInRig = rootIndex+1;
        int eiInRig = eiIn;
        
        int leftSubtreeLength = eiInLef - siInLef + 1;
        int eiPreLef = siPreLef + leftSubtreeLength - 1; 
        int siPreRig = eiPreLef+1;
        
        root.left = buildTreeHelper(inorder,preorder,siPreLef,eiPreLef,siInLef,eiInLef,n);
        root.right = buildTreeHelper(inorder,preorder,siPreRig,eiPreRig,siInRig,eiInRig,n);
        return root;
    }
