class PairOfNode{
    Node<Integer> head;
    Node<Integer> tail;
}

public static Node<Integer> constructLL(BinaryTreeNode<Integer> root){
        return constructLLHelper(root).head;
    }

    private static PairOfNode constructLLHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            PairOfNode pair = new PairOfNode();
            return pair;
        }
        Node<Integer> newNode = new Node<>(root.data);
        PairOfNode leftNodes = constructLLHelper(root.left);
        PairOfNode rightNodes = constructLLHelper(root.right);
        if(leftNodes.tail != null){
            leftNodes.tail.next = newNode;
        }
        newNode.next = rightNodes.head;

        PairOfNode pair = new PairOfNode();
        if(leftNodes.head!=null) {
            pair.head = leftNodes.head;
        } else {
            pair.head = newNode;
        }

        if(rightNodes.tail!=null){
            pair.tail = rightNodes.tail;
        } else {
            pair.tail = newNode;
        }
        return pair;
    }
