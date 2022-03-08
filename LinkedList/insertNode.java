public static Node<Integer> insertNode(Node<Integer> head,int index,Node<Integer> n1){
        int position = 0;
        Node<Integer> temp = head;
        if(index == 0){
            n1.next = head;
            head = n1;
        } else {
            while(temp!=null && position<index-1){
                position++;
                temp = temp.next;
            }
            if(temp!=null){
                n1.next = temp.next;
                temp.next = n1;
            }
        }
        return head;
    }
