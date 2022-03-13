public static TreeNode<Integer> takeInput(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter next Node data:");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i=0;i<root.children.size();i++){
            s = s+root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }
