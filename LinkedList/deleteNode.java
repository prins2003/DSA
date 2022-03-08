public static Node<Integer> deleteNode(Node<Integer> head,int position){
        int index = 0;
        Node<Integer> prev = head;

        if(position == 0){
            head = head.next;
        } else {
            while(prev!=null && index<(position-1)){
                index++;
                prev = prev.next;
            }
            if(prev!=null && prev.next!=null){
                prev.next = prev.next.next;
            }
        }
        return head;
    }
