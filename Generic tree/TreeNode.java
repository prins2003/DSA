public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;   // In this Array list we will store children so every children will be type TreeNode and TreeNode's data will be T type

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
