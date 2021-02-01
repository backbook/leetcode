package DataStructure.LinkedList;


public class LinkedList<Data> {

    private class Node<Data>{
        //定义数据类型
        Data data;
        //定义
        Node<Data> next;
        public Node(Data data){
            this.data = data;
        }
    }

    private Node head;

    private Node last;

    private int size;

    public Node get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node temp = head;
        for (int i = 0; i < index;i++ ){
            temp = temp.next;
        }
        return temp;
    }

    private void insert(Data data,int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node insertNode = new Node(data);
        if (size == 0){
            head = insertNode;
            last = insertNode;
        }else if (index == 0){
            insertNode.next = head;
            head = insertNode;
        }else if(index == size) {
            last.next = insertNode;
            last = insertNode;
        }else {
            Node prevNode = get(index - 1) ;
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size ++;
    }
    public void  print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }







    public static void main(String[] args) {
        LinkedList<Integer>  linkedList = new LinkedList();
        linkedList.insert(10,0);
        linkedList.insert(2,1);
        linkedList.insert(5,2);
        linkedList.print();
    }


}
