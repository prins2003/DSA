public static int length(Node<Integer> head){
        Node<Integer> temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
