public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head==null){
                // Make this node as head node
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null){
                    tail = tail.next;
                }
                // Now tail will refer to the last node
                // Connect current node after last node
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
