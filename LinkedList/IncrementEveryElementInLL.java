public static void incrementAll(Node<Integer> head){
        while (head!=null){
            head.data++;
            head = head.next;
        }
    }
