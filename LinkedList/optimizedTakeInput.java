public static Node<Integer> optimizedTakeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head==null){
                // Make this node as head node
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next =currentNode;
                tail = currentNode;  // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
