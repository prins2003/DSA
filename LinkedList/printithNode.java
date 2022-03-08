public static void printIthNode(Node<Integer> head,int i){
        Node<Integer> temp = head;
        int position = 0;
        while (temp!=null && position<i){
            position++;
            temp = temp.next;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }
    }
