public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;   // In this Array list we will store children so every children will be type TreeNode and TreeNode's data will be T type

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}


public class TreeUse {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(5);
        TreeNode<Integer> node4 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);


    }
}
